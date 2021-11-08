/* eslint-disable react/prop-types */
/* eslint-disable react/destructuring-assignment */
// React imports
import React from 'react';
// Router imports
import { Link } from '@reach/router';
// Material UI imports
// eslint-disable-next-line import/no-unresolved
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import DeleteIcon from '@material-ui/icons/Delete';
import EditIcon from '@material-ui/icons/Edit';
import Paper from '@material-ui/core/Paper';

// eslint-disable-next-line import/prefer-default-export
export const UserTable = (props) => (
  <TableContainer component={Paper}>
    <Table aria-label="simple table">
      <TableHead>
        <TableRow>
          <TableCell>NOMES</TableCell>
          <TableCell>ID USINA</TableCell>
          <TableCell>PARTICIPAÇÃO</TableCell>
          <TableCell>EDITAR</TableCell>
          <TableCell />
        </TableRow>
      </TableHead>
      <TableBody>
        {props.rows.map((row) => (
          <TableRow key={row.id}>
            <TableCell component="th" scope="row">
              <Link to={`/users/${row.id}`}>
                {row.nomeCliente}
              </Link>
            </TableCell>
            <TableCell>{row.usinaId}</TableCell>
            <TableCell>
              {row.percentualDeParticipacao}
              {' '}
              {'%'}
            </TableCell>
            <TableCell>
              <EditIcon onClick={() => props.openEditModal(row)} />
              <DeleteIcon onClick={() => props.onDelete(row)} />
            </TableCell>
          </TableRow>
        ))}
      </TableBody>
    </Table>
  </TableContainer>
);
