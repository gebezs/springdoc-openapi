/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package test.org.springdoc.api.app68.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.org.springdoc.api.app68.model.User;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@javax.annotation.Generated(value = "org.springdoc.demo.app2.codegen.languages.SpringCodegen", date = "2019-07-11T00:09:29.839+02:00[Europe/Paris]")

@Tag(name = "user", description = "the user API")
public interface UserApi {

    default UserApiDelegate getDelegate() {
        return new UserApiDelegate() {
        };
    }

    @Operation(summary = "Create user", tags = {"user"})
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation")})
    @PostMapping(value = "/user", consumes = {"application/json"})
    default ResponseEntity<Void> createUser(
            @Parameter(description = "Created user object", required = true) @Valid @RequestBody User user) {
        return getDelegate().createUser(user);
    }

    @Operation(summary = "Creates list of users with given input array", tags = {"user"})
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation")})

    @PostMapping(value = "/user/createWithArray", consumes = {"application/json"})
    default ResponseEntity<Void> createUsersWithArrayInput(
            @Parameter(description = "List of user object", required = true) @Valid @RequestBody List<User> user) {
        return getDelegate().createUsersWithArrayInput(user);
    }

    @Operation(summary = "Creates list of users with given input array", tags = {"user"})
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation")})
    @PostMapping(value = "/user/createWithList", consumes = {"application/json"})
    default ResponseEntity<Void> createUsersWithListInput(
            @Parameter(description = "List of user object", required = true) @Valid @RequestBody List<User> user) {
        return getDelegate().createUsersWithListInput(user);
    }

    @Operation(summary = "Creates list of users with given input array", tags = {"user"})
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation")})

    @DeleteMapping(value = "/user/{username}")
    default ResponseEntity<Void> deleteUser(
            @Parameter(description = "The name that needs to be deleted", required = true) @PathVariable("username") String username) {
        return getDelegate().deleteUser(username);
    }

    @Operation(summary = "Get user by user name", tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")})

    @GetMapping(value = "/user/{username}", produces = {"application/xml", "application/json"})
    default ResponseEntity<User> getUserByName(
            @Parameter(description = "The name that needs to be fetched. Use user1 for testing.", required = true) @PathVariable("username") String username) {
        return getDelegate().getUserByName(username);
    }

    @Operation(summary = "Logs user into the system", tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "400", description = "Invalid username/password supplied")})
    @GetMapping(value = "/user/login", produces = {"application/xml", "application/json"})
    default ResponseEntity<String> loginUser(
            @NotNull @Parameter(description = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,
            @NotNull @Parameter(description = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        return getDelegate().loginUser(username, password);
    }

    @Operation(summary = "Logs out current logged in user session", tags = {"user"})
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation")})
    @GetMapping(value = "/user/logout")
    default ResponseEntity<Void> logoutUser() {
        return getDelegate().logoutUser();
    }

    @Operation(summary = "Updated user", tags = {"user"})
    @ApiResponses(value = {@ApiResponse(responseCode = "400", description = "Invalid user supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")})
    @PutMapping(value = "/user/{username}", consumes = {"application/json"})
    default ResponseEntity<Void> updateUser(
            @Parameter(description = "name that need to be deleted", required = true) @PathVariable("username") String username,
            @Parameter(description = "Updated user object", required = true) @Valid @RequestBody User user) {
        return getDelegate().updateUser(username, user);
    }

}
