/* eslint-disable react/destructuring-assignment */
/* eslint-disable react/prop-types */
// React imports
import React from 'react';
// Material UI imports
// eslint-disable-next-line import/no-unresolved
import Alert from '@material-ui/lab/Alert';
import Snackbar from '@material-ui/core/Snackbar';

// eslint-disable-next-line import/prefer-default-export
export const AlertBar = (props) => (
  <Snackbar
    anchorOrigin={{ vertical: 'top', horizontal: 'right' }}
    // eslint-disable-next-line react/destructuring-assignment
    open={props.open}
    autoHideDuration={6000}
    onClose={props.onClose}
  >
    <Alert variant="filled" severity={props.alertMeta.severity} onClose={props.onClose}>
      {props.alertMeta.message}
    </Alert>
  </Snackbar>
);
