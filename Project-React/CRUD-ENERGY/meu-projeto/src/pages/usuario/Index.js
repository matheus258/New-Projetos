// React imports
import React from 'react';
// Router imports
import { Redirect, Router } from '@reach/router';
// Local imports
import UserList from '../../components/user/user-list.component';
import UserDetails from '../../components/user/user-details.component';

const Index = () => (
  <div>
    <div className="container mt-3">
      <Router>
        <UserList path="usuario" />
        <UserDetails path="users/:id" />
        <Redirect from="/" to="/usuario" default noThrow />
      </Router>
    </div>
  </div>
);

export default Index;
