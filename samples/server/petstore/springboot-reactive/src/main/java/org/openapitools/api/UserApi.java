/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import org.openapitools.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default UserApiDelegate getDelegate() {
        return new UserApiDelegate() {};
    }

    @ApiOperation(value = "Create user", nickname = "createUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user",
        method = RequestMethod.POST)
    default Mono<ResponseEntity<Void>> createUser(@ApiParam(value = "Created user object" ,required=true ) @Valid @RequestBody Mono<User> body, ServerWebExchange exchange) {
        return getDelegate().createUser(body, exchange);
    }


    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithArrayInput", notes = "", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithArray",
        method = RequestMethod.POST)
    default Mono<ResponseEntity<Void>> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true ) @Valid @RequestBody Flux<User> body, ServerWebExchange exchange) {
        return getDelegate().createUsersWithArrayInput(body, exchange);
    }


    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithListInput", notes = "", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithList",
        method = RequestMethod.POST)
    default Mono<ResponseEntity<Void>> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true ) @Valid @RequestBody Flux<User> body, ServerWebExchange exchange) {
        return getDelegate().createUsersWithListInput(body, exchange);
    }


    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.DELETE)
    default Mono<ResponseEntity<Void>> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username, ServerWebExchange exchange) {
        return getDelegate().deleteUser(username, exchange);
    }


    @ApiOperation(value = "Get user by user name", nickname = "getUserByName", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<User>> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true) @PathVariable("username") String username, ServerWebExchange exchange) {
        return getDelegate().getUserByName(username, exchange);
    }


    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = String.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    @RequestMapping(value = "/user/login",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<String>> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password, ServerWebExchange exchange) {
        return getDelegate().loginUser(username, password, exchange);
    }


    @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/logout",
        method = RequestMethod.GET)
    default Mono<ResponseEntity<Void>> logoutUser(ServerWebExchange exchange) {
        return getDelegate().logoutUser(exchange);
    }


    @ApiOperation(value = "Updated user", nickname = "updateUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.PUT)
    default Mono<ResponseEntity<Void>> updateUser(@ApiParam(value = "name that need to be deleted",required=true) @PathVariable("username") String username,@ApiParam(value = "Updated user object" ,required=true ) @Valid @RequestBody Mono<User> body, ServerWebExchange exchange) {
        return getDelegate().updateUser(username, body, exchange);
    }

}
