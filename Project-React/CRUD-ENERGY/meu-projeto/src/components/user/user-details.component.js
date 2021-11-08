/* eslint-disable react/prop-types */
// React imports
import React, { useEffect, useState } from 'react';
// Router imports
import { Link } from '@reach/router';
// Material UI imports
// eslint-disable-next-line import/no-unresolved
import Accordion from '@material-ui/core/Accordion';
import AccordionSummary from '@material-ui/core/AccordionSummary';
import AccordionDetails from '@material-ui/core/AccordionDetails';
import Typography from '@material-ui/core/Typography';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import LinearProgress from '@material-ui/core/LinearProgress';
// Local imports
import { getUser } from '../../services/users-http.service';
import '../../assets/css/CrudUsers.css';

const UserDetails = (props) => {
  // Accordion show/hide
  const [expanded, setExpanded] = useState('panel1');
  const [users, setUsers] = useState(null);
  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    // eslint-disable-next-line react/prop-types
    getUser(props.id).then((res) => {
      setUsers(res.data);
      setIsLoading(false);
    });
  // eslint-disable-next-line react/destructuring-assignment
  }, [props.id]);

  const handleChange = (panel) => (event, newExpanded) => {
    setExpanded(newExpanded ? panel : false);
  };

  if (isLoading) {
    return <LinearProgress />;
  }
  return (
    <div>
      <Link className="link-voltar" to="/usuario"> Voltar</Link>
      <Accordion expanded={expanded === 'panel1'} onChange={handleChange('panel1')}>
        <AccordionSummary
          expandIcon={<ExpandMoreIcon />}
          aria-controls="panel1a-content"
          id="panel1a-header"
        >
          <Typography>Detalhes de Usuários</Typography>
        </AccordionSummary>
        <AccordionDetails>
          <Typography component="span">
            <div>
              Id Usuário:
              {users.id}
            </div>
            <div>
              Nome:
              {users.nomeCliente}
            </div>
            <div>
              Usina ID:
              {users.usinaId}
            </div>
            <div>
              Porcentagem de Participação:
              {users.percentualDeParticipacao}
              {'%'}
            </div>
          </Typography>
        </AccordionDetails>
      </Accordion>
    </div>
  );
};
export default UserDetails;
