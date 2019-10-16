// tslint:disable
/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Observable } from 'rxjs';
import { BaseAPI, HttpHeaders, HttpQuery, throwIfRequired, encodeURI } from '../runtime';
import {
    User,
} from '../models';

export interface CreateUserRequest {
    body: User;
}

export interface CreateUsersWithArrayInputRequest {
    body: Array<User>;
}

export interface CreateUsersWithListInputRequest {
    body: Array<User>;
}

export interface DeleteUserRequest {
    username: string;
}

export interface GetUserByNameRequest {
    username: string;
}

export interface LoginUserRequest {
    username: string;
    password: string;
}

export interface UpdateUserRequest {
    username: string;
    body: User;
}

/**
 * no description
 */
export class UserApi extends BaseAPI {

    /**
     * This can only be done by the logged in user.
     * Create user
     */
    createUser = (requestParameters: CreateUserRequest): Observable<void> => {
        throwIfRequired(requestParameters, 'body', 'createUser');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<void>({
            path: '/user',
            method: 'POST',
            headers,
            body: requestParameters.body,
        });
    };

    /**
     * Creates list of users with given input array
     */
    createUsersWithArrayInput = (requestParameters: CreateUsersWithArrayInputRequest): Observable<void> => {
        throwIfRequired(requestParameters, 'body', 'createUsersWithArrayInput');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<void>({
            path: '/user/createWithArray',
            method: 'POST',
            headers,
            body: requestParameters.body,
        });
    };

    /**
     * Creates list of users with given input array
     */
    createUsersWithListInput = (requestParameters: CreateUsersWithListInputRequest): Observable<void> => {
        throwIfRequired(requestParameters, 'body', 'createUsersWithListInput');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<void>({
            path: '/user/createWithList',
            method: 'POST',
            headers,
            body: requestParameters.body,
        });
    };

    /**
     * This can only be done by the logged in user.
     * Delete user
     */
    deleteUser = (requestParameters: DeleteUserRequest): Observable<void> => {
        throwIfRequired(requestParameters, 'username', 'deleteUser');

        return this.request<void>({
            path: '/user/{username}'.replace('{username}', encodeURI(requestParameters.username)),
            method: 'DELETE',
        });
    };

    /**
     * Get user by user name
     */
    getUserByName = (requestParameters: GetUserByNameRequest): Observable<User> => {
        throwIfRequired(requestParameters, 'username', 'getUserByName');

        return this.request<User>({
            path: '/user/{username}'.replace('{username}', encodeURI(requestParameters.username)),
            method: 'GET',
        });
    };

    /**
     * Logs user into the system
     */
    loginUser = (requestParameters: LoginUserRequest): Observable<string> => {
        throwIfRequired(requestParameters, 'username', 'loginUser');
        throwIfRequired(requestParameters, 'password', 'loginUser');

        const query: HttpQuery = <HttpQuery>{
            ...(requestParameters.username && { 'username': requestParameters.username }),
            ...(requestParameters.password && { 'password': requestParameters.password }),
        };

        return this.request<string>({
            path: '/user/login',
            method: 'GET',
            query,
        });
    };

    /**
     * Logs out current logged in user session
     */
    logoutUser = (): Observable<void> => {
        return this.request<void>({
            path: '/user/logout',
            method: 'GET',
        });
    };

    /**
     * This can only be done by the logged in user.
     * Updated user
     */
    updateUser = (requestParameters: UpdateUserRequest): Observable<void> => {
        throwIfRequired(requestParameters, 'username', 'updateUser');
        throwIfRequired(requestParameters, 'body', 'updateUser');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<void>({
            path: '/user/{username}'.replace('{username}', encodeURI(requestParameters.username)),
            method: 'PUT',
            headers,
            body: requestParameters.body,
        });
    };

}
