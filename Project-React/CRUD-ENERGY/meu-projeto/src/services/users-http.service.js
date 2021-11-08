import http from '../http-common';

export const getAllUsers = () => http.get('/users');

export const getUser = (id) => http.get(`/users/${id}`);

export const createUser = (data) => http.post('/users', data);

export const updateUser = (id, data) => http.put(`/users/${id}`, data);

export const removeUser = (id) => http.delete(`/users/${id}`);
