/* eslint-disable react/prop-types */
/* eslint-disable react/destructuring-assignment */
// React imports
import React from 'react';
// Lodash imports
import _ from 'lodash/fp';
// Form imports
import { useForm } from 'react-hook-form';
// Material UI imports
// eslint-disable-next-line import/no-unresolved
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import Dialog from '@material-ui/core/Dialog';
import DialogContent from '@material-ui/core/DialogContent';
import DialogTitle from '@material-ui/core/DialogTitle';

const UserFormDialog = (props) => {
  const { register, handleSubmit, errors } = useForm();

  const onSubmit = (data) => {
    props.handleSubmit(data);
  };

  return (
    <Dialog fullWidth open={props.open} onClose={props.handleClose} aria-labelledby="form-dialog-title">
      <DialogTitle id="form-dialog-title">ADICIONAR | EDITAR </DialogTitle>
      <DialogContent>
        <form onSubmit={handleSubmit(onSubmit)}>
          <TextField
            inputRef={register({ required: true })}
            name="id"
            autoFocus
            margin="dense"
            id="id"
            label="Id"
            type="Integer"
            fullWidth
            defaultValue={props.selected.id}
            disabled={!!props.selected.id}
          />
          {_.get('id.type', errors) === 'required' && (
            <p className="error">Este campo é obrigatório!</p>
          )}
          <TextField
            inputRef={register({ required: true })}
            name="nomeCliente"
            margin="dense"
            id="nomeCliente"
            label="Nome"
            type="text"
            fullWidth
            defaultValue={props.selected.name}
          />
          {_.get('nomeCliente.type', errors) === 'required' && (
            <p className="error">Este campo é obrigatório!</p>
          )}
          <TextField
            inputRef={register({ required: true })}
            name="usinaId"
            margin="dense"
            id="usinaId"
            label="ID usina"
            type="Integer"
            fullWidth
            defaultValue={props.selected.usinaId}
          />
          {_.get('usinaId.type', errors) === 'required' && (
            <p>Este campo é obrigatório!</p>
          )}

          <TextField
            inputRef={register({ required: true })}
            name="percentualDeParticipacao"
            margin="dense"
            id="percentualDeParticipacao"
            label="Participaçao"
            type="Integer"
            fullWidth
            defaultValue={props.selected.percentualDeParticipacao}
          />
          {_.get('percentualDeParticipacao.type', errors) === 'required' && (
            <p>Este campo é obrigatório!</p>
          )}
          <Button onClick={props.handleClose} color="primary">
            Cancelar
          </Button>
          <Button type="submit" color="primary">
            Atualizar
          </Button>
        </form>
      </DialogContent>
    </Dialog>
  );
};

export default UserFormDialog;
