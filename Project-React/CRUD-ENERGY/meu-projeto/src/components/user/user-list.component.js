// React imports
import React, { useEffect, useState } from 'react';
// Material UI imports
// eslint-disable-next-line import/no-unresolved
import { Button } from '@material-ui/core';
// Local imports
import {
  createUser, getAllUsers, removeUser, updateUser,
} from '../../services/users-http.service';
import UserFormDialog from './user-form-dialog.component';
import { UserTable } from './user-table.component';
import { AlertBar } from './alert-bar.component';
import '../../assets/css/CrudUsers.css';

const UserList = () => {
  const [rows, setRows] = useState([]);
  const [alertMeta, setAlertMeta] = useState({ severity: '', message: '' });
  const [isUserListManipulated, setUserListManipulated] = useState(false);
  const [isDialogOpen, setDialogOpen] = useState(false);
  const [isAlertOpen, setAlertOpen] = useState(false);
  const [selected, setSelected] = useState({ id: '', nomeCliente: '' });

  useEffect(() => {
    getAllUsers().then((res) => setRows(res.data));
  }, []);

  useEffect(() => {
    if (isUserListManipulated) {
      getAllUsers().then((res) => setRows(res.data));
    }
    setUserListManipulated(false);
  }, [isUserListManipulated]);

  const add = (data) => {
    createUser(data)
      .then(() => {
        // eslint-disable-next-line no-use-before-define
        showAlert('success', 'Criado com Sucesso');
        // eslint-disable-next-line no-use-before-define
        closeDialog();
      })
      // eslint-disable-next-line no-use-before-define
      .catch(() => showAlert('error', 'Falha ao criar'));
  };

  const showAlert = (severity, message) => {
    setUserListManipulated(true);
    setAlertMeta({ severity, message });
    setAlertOpen(true);
  };

  const closeDialog = () => {
    setDialogOpen(false);
    setSelected({ id: '', name: '', capital: '' });
  };

  const edit = (data) => {
    // eslint-disable-next-line no-param-reassign
    data.id = selected.id;
    updateUser(data.id, data)
      .then(() => {
        showAlert('success', 'Atualização com Sucesso!');
        closeDialog();
      })
      .catch(() => showAlert('error', 'Falha ao Atualizar!'));
  };

  const remove = (row) => {
    removeUser(row.id)
      .then(() => showAlert('success', 'Excluido com Sucesso!'))
      .catch(() => showAlert('error', 'Falha ao Deletar!'));
  };

  const openCreateDialog = () => {
    // eslint-disable-next-line no-use-before-define
    openUserFormDialog({ id: '', name: '', usinas: '' });
  };

  const openEditDialog = (row) => {
    // eslint-disable-next-line no-use-before-define
    openUserFormDialog(row);
  };

  const openUserFormDialog = (row) => {
    setDialogOpen(true);
    setSelected(row);
  };

  const handleSubmit = (user) => {
    if (selected.id) {
      edit(user);
    } else {
      add(user);
    }
  };

  const handleAlertClose = (event, reason) => {
    if (reason === 'clickaway') {
      return;
    }
    setAlertOpen(false);
  };

  return (
    <div className="crud-criacao">
      <AlertBar open={isAlertOpen} onClose={handleAlertClose} alertMeta={alertMeta} />
      <Button onClick={openCreateDialog}>ADICIONAR USUARIOS</Button>
      <UserFormDialog
        open={isDialogOpen}
        handleClose={closeDialog}
        handleSubmit={handleSubmit}
        selected={selected}
      />
      <UserTable rows={rows} onDelete={remove} openEditModal={openEditDialog} />
    </div>
  );
};

export default UserList;
