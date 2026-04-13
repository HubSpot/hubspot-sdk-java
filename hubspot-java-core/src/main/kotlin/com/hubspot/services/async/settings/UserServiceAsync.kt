// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.settings

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.settings.users.CollectionResponsePublicPermissionSetNoPaging
import com.hubspot.models.settings.users.CollectionResponsePublicTeamNoPaging
import com.hubspot.models.settings.users.PublicUser
import com.hubspot.models.settings.users.UserCreateParams
import com.hubspot.models.settings.users.UserDeleteParams
import com.hubspot.models.settings.users.UserGetParams
import com.hubspot.models.settings.users.UserListPageAsync
import com.hubspot.models.settings.users.UserListParams
import com.hubspot.models.settings.users.UserListRolesParams
import com.hubspot.models.settings.users.UserListTeamsParams
import com.hubspot.models.settings.users.UserProvisionRequest
import com.hubspot.models.settings.users.UserUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    fun create(params: UserCreateParams): CompletableFuture<PublicUser> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicUser>

    /** @see create */
    fun create(
        userProvisionRequest: UserProvisionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicUser> =
        create(
            UserCreateParams.builder().userProvisionRequest(userProvisionRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(userProvisionRequest: UserProvisionRequest): CompletableFuture<PublicUser> =
        create(userProvisionRequest, RequestOptions.none())

    /**
     * Modifies a user identified by `userId`. `userId` refers to the user's ID by default, or
     * optionally email as specified by the `IdProperty` query param.
     */
    fun update(userId: String, params: UserUpdateParams): CompletableFuture<PublicUser> =
        update(userId, params, RequestOptions.none())

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicUser> =
        update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(params: UserUpdateParams): CompletableFuture<PublicUser> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicUser>

    fun list(): CompletableFuture<UserListPageAsync> = list(UserListParams.none())

    /** @see list */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserListPageAsync>

    /** @see list */
    fun list(params: UserListParams = UserListParams.none()): CompletableFuture<UserListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserListPageAsync> =
        list(UserListParams.none(), requestOptions)

    /**
     * Removes a user identified by `userId`. `userId` refers to the user's ID by default, or
     * optionally email as specified by the `IdProperty` query param.
     */
    fun delete(userId: String): CompletableFuture<Void?> = delete(userId, UserDeleteParams.none())

    /** @see delete */
    fun delete(
        userId: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see delete */
    fun delete(
        userId: String,
        params: UserDeleteParams = UserDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(userId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: UserDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(userId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(userId, UserDeleteParams.none(), requestOptions)

    /**
     * Retrieves a user identified by `userId`. `userId` refers to the user's ID by default, or
     * optionally email as specified by the `IdProperty` query param.
     */
    fun get(userId: String): CompletableFuture<PublicUser> = get(userId, UserGetParams.none())

    /** @see get */
    fun get(
        userId: String,
        params: UserGetParams = UserGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicUser> =
        get(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see get */
    fun get(
        userId: String,
        params: UserGetParams = UserGetParams.none(),
    ): CompletableFuture<PublicUser> = get(userId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: UserGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicUser>

    /** @see get */
    fun get(params: UserGetParams): CompletableFuture<PublicUser> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(userId: String, requestOptions: RequestOptions): CompletableFuture<PublicUser> =
        get(userId, UserGetParams.none(), requestOptions)

    /** Retrieves the roles on an account */
    fun listRoles(): CompletableFuture<CollectionResponsePublicPermissionSetNoPaging> =
        listRoles(UserListRolesParams.none())

    /** @see listRoles */
    fun listRoles(
        params: UserListRolesParams = UserListRolesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicPermissionSetNoPaging>

    /** @see listRoles */
    fun listRoles(
        params: UserListRolesParams = UserListRolesParams.none()
    ): CompletableFuture<CollectionResponsePublicPermissionSetNoPaging> =
        listRoles(params, RequestOptions.none())

    /** @see listRoles */
    fun listRoles(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicPermissionSetNoPaging> =
        listRoles(UserListRolesParams.none(), requestOptions)

    /** View teams for this account */
    fun listTeams(): CompletableFuture<CollectionResponsePublicTeamNoPaging> =
        listTeams(UserListTeamsParams.none())

    /** @see listTeams */
    fun listTeams(
        params: UserListTeamsParams = UserListTeamsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicTeamNoPaging>

    /** @see listTeams */
    fun listTeams(
        params: UserListTeamsParams = UserListTeamsParams.none()
    ): CompletableFuture<CollectionResponsePublicTeamNoPaging> =
        listTeams(params, RequestOptions.none())

    /** @see listTeams */
    fun listTeams(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicTeamNoPaging> =
        listTeams(UserListTeamsParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /settings/users/2026-03`, but is otherwise the same
         * as [UserServiceAsync.create].
         */
        fun create(params: UserCreateParams): CompletableFuture<HttpResponseFor<PublicUser>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicUser>>

        /** @see create */
        fun create(
            userProvisionRequest: UserProvisionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicUser>> =
            create(
                UserCreateParams.builder().userProvisionRequest(userProvisionRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            userProvisionRequest: UserProvisionRequest
        ): CompletableFuture<HttpResponseFor<PublicUser>> =
            create(userProvisionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /settings/users/2026-03/{userId}`, but is otherwise
         * the same as [UserServiceAsync.update].
         */
        fun update(
            userId: String,
            params: UserUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicUser>> =
            update(userId, params, RequestOptions.none())

        /** @see update */
        fun update(
            userId: String,
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicUser>> =
            update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        fun update(params: UserUpdateParams): CompletableFuture<HttpResponseFor<PublicUser>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicUser>>

        /**
         * Returns a raw HTTP response for `get /settings/users/2026-03`, but is otherwise the same
         * as [UserServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(UserListParams.none())

        /** @see list */
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>>

        /** @see list */
        fun list(
            params: UserListParams = UserListParams.none()
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /settings/users/2026-03/{userId}`, but is
         * otherwise the same as [UserServiceAsync.delete].
         */
        fun delete(userId: String): CompletableFuture<HttpResponse> =
            delete(userId, UserDeleteParams.none())

        /** @see delete */
        fun delete(
            userId: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see delete */
        fun delete(
            userId: String,
            params: UserDeleteParams = UserDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(userId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: UserDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(userId, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/users/2026-03/{userId}`, but is otherwise
         * the same as [UserServiceAsync.get].
         */
        fun get(userId: String): CompletableFuture<HttpResponseFor<PublicUser>> =
            get(userId, UserGetParams.none())

        /** @see get */
        fun get(
            userId: String,
            params: UserGetParams = UserGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicUser>> =
            get(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see get */
        fun get(
            userId: String,
            params: UserGetParams = UserGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicUser>> =
            get(userId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: UserGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicUser>>

        /** @see get */
        fun get(params: UserGetParams): CompletableFuture<HttpResponseFor<PublicUser>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicUser>> =
            get(userId, UserGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/users/2026-03/roles`, but is otherwise the
         * same as [UserServiceAsync.listRoles].
         */
        fun listRoles():
            CompletableFuture<HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging>> =
            listRoles(UserListRolesParams.none())

        /** @see listRoles */
        fun listRoles(
            params: UserListRolesParams = UserListRolesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging>>

        /** @see listRoles */
        fun listRoles(
            params: UserListRolesParams = UserListRolesParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging>> =
            listRoles(params, RequestOptions.none())

        /** @see listRoles */
        fun listRoles(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging>> =
            listRoles(UserListRolesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/users/2026-03/teams`, but is otherwise the
         * same as [UserServiceAsync.listTeams].
         */
        fun listTeams(): CompletableFuture<HttpResponseFor<CollectionResponsePublicTeamNoPaging>> =
            listTeams(UserListTeamsParams.none())

        /** @see listTeams */
        fun listTeams(
            params: UserListTeamsParams = UserListTeamsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicTeamNoPaging>>

        /** @see listTeams */
        fun listTeams(
            params: UserListTeamsParams = UserListTeamsParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicTeamNoPaging>> =
            listTeams(params, RequestOptions.none())

        /** @see listTeams */
        fun listTeams(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicTeamNoPaging>> =
            listTeams(UserListTeamsParams.none(), requestOptions)
    }
}
