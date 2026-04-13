// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.settings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.settings.users.CollectionResponsePublicPermissionSetNoPaging
import com.hubspot.sdk.models.settings.users.CollectionResponsePublicTeamNoPaging
import com.hubspot.sdk.models.settings.users.PublicUser
import com.hubspot.sdk.models.settings.users.UserCreateParams
import com.hubspot.sdk.models.settings.users.UserDeleteParams
import com.hubspot.sdk.models.settings.users.UserGetParams
import com.hubspot.sdk.models.settings.users.UserListPage
import com.hubspot.sdk.models.settings.users.UserListParams
import com.hubspot.sdk.models.settings.users.UserListRolesParams
import com.hubspot.sdk.models.settings.users.UserListTeamsParams
import com.hubspot.sdk.models.settings.users.UserProvisionRequest
import com.hubspot.sdk.models.settings.users.UserUpdateParams
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    fun create(params: UserCreateParams): PublicUser = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicUser

    /** @see create */
    fun create(
        userProvisionRequest: UserProvisionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicUser =
        create(
            UserCreateParams.builder().userProvisionRequest(userProvisionRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(userProvisionRequest: UserProvisionRequest): PublicUser =
        create(userProvisionRequest, RequestOptions.none())

    /**
     * Modifies a user identified by `userId`. `userId` refers to the user's ID by default, or
     * optionally email as specified by the `IdProperty` query param.
     */
    fun update(userId: String, params: UserUpdateParams): PublicUser =
        update(userId, params, RequestOptions.none())

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicUser = update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(params: UserUpdateParams): PublicUser = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicUser

    fun list(): UserListPage = list(UserListParams.none())

    /** @see list */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserListPage

    /** @see list */
    fun list(params: UserListParams = UserListParams.none()): UserListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserListPage =
        list(UserListParams.none(), requestOptions)

    /**
     * Removes a user identified by `userId`. `userId` refers to the user's ID by default, or
     * optionally email as specified by the `IdProperty` query param.
     */
    fun delete(userId: String) = delete(userId, UserDeleteParams.none())

    /** @see delete */
    fun delete(
        userId: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see delete */
    fun delete(userId: String, params: UserDeleteParams = UserDeleteParams.none()) =
        delete(userId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: UserDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(userId: String, requestOptions: RequestOptions) =
        delete(userId, UserDeleteParams.none(), requestOptions)

    /**
     * Retrieves a user identified by `userId`. `userId` refers to the user's ID by default, or
     * optionally email as specified by the `IdProperty` query param.
     */
    fun get(userId: String): PublicUser = get(userId, UserGetParams.none())

    /** @see get */
    fun get(
        userId: String,
        params: UserGetParams = UserGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicUser = get(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see get */
    fun get(userId: String, params: UserGetParams = UserGetParams.none()): PublicUser =
        get(userId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: UserGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicUser

    /** @see get */
    fun get(params: UserGetParams): PublicUser = get(params, RequestOptions.none())

    /** @see get */
    fun get(userId: String, requestOptions: RequestOptions): PublicUser =
        get(userId, UserGetParams.none(), requestOptions)

    /** Retrieves the roles on an account */
    fun listRoles(): CollectionResponsePublicPermissionSetNoPaging =
        listRoles(UserListRolesParams.none())

    /** @see listRoles */
    fun listRoles(
        params: UserListRolesParams = UserListRolesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicPermissionSetNoPaging

    /** @see listRoles */
    fun listRoles(
        params: UserListRolesParams = UserListRolesParams.none()
    ): CollectionResponsePublicPermissionSetNoPaging = listRoles(params, RequestOptions.none())

    /** @see listRoles */
    fun listRoles(requestOptions: RequestOptions): CollectionResponsePublicPermissionSetNoPaging =
        listRoles(UserListRolesParams.none(), requestOptions)

    /** View teams for this account */
    fun listTeams(): CollectionResponsePublicTeamNoPaging = listTeams(UserListTeamsParams.none())

    /** @see listTeams */
    fun listTeams(
        params: UserListTeamsParams = UserListTeamsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicTeamNoPaging

    /** @see listTeams */
    fun listTeams(
        params: UserListTeamsParams = UserListTeamsParams.none()
    ): CollectionResponsePublicTeamNoPaging = listTeams(params, RequestOptions.none())

    /** @see listTeams */
    fun listTeams(requestOptions: RequestOptions): CollectionResponsePublicTeamNoPaging =
        listTeams(UserListTeamsParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /settings/users/2026-03`, but is otherwise the same
         * as [UserService.create].
         */
        @MustBeClosed
        fun create(params: UserCreateParams): HttpResponseFor<PublicUser> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicUser>

        /** @see create */
        @MustBeClosed
        fun create(
            userProvisionRequest: UserProvisionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicUser> =
            create(
                UserCreateParams.builder().userProvisionRequest(userProvisionRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(userProvisionRequest: UserProvisionRequest): HttpResponseFor<PublicUser> =
            create(userProvisionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /settings/users/2026-03/{userId}`, but is otherwise
         * the same as [UserService.update].
         */
        @MustBeClosed
        fun update(userId: String, params: UserUpdateParams): HttpResponseFor<PublicUser> =
            update(userId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            userId: String,
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicUser> =
            update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: UserUpdateParams): HttpResponseFor<PublicUser> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicUser>

        /**
         * Returns a raw HTTP response for `get /settings/users/2026-03`, but is otherwise the same
         * as [UserService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<UserListPage> = list(UserListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: UserListParams = UserListParams.none()): HttpResponseFor<UserListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserListPage> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /settings/users/2026-03/{userId}`, but is
         * otherwise the same as [UserService.delete].
         */
        @MustBeClosed
        fun delete(userId: String): HttpResponse = delete(userId, UserDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            userId: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            userId: String,
            params: UserDeleteParams = UserDeleteParams.none(),
        ): HttpResponse = delete(userId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: UserDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(userId: String, requestOptions: RequestOptions): HttpResponse =
            delete(userId, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/users/2026-03/{userId}`, but is otherwise
         * the same as [UserService.get].
         */
        @MustBeClosed
        fun get(userId: String): HttpResponseFor<PublicUser> = get(userId, UserGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            userId: String,
            params: UserGetParams = UserGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicUser> =
            get(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            userId: String,
            params: UserGetParams = UserGetParams.none(),
        ): HttpResponseFor<PublicUser> = get(userId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: UserGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicUser>

        /** @see get */
        @MustBeClosed
        fun get(params: UserGetParams): HttpResponseFor<PublicUser> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(userId: String, requestOptions: RequestOptions): HttpResponseFor<PublicUser> =
            get(userId, UserGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/users/2026-03/roles`, but is otherwise the
         * same as [UserService.listRoles].
         */
        @MustBeClosed
        fun listRoles(): HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging> =
            listRoles(UserListRolesParams.none())

        /** @see listRoles */
        @MustBeClosed
        fun listRoles(
            params: UserListRolesParams = UserListRolesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging>

        /** @see listRoles */
        @MustBeClosed
        fun listRoles(
            params: UserListRolesParams = UserListRolesParams.none()
        ): HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging> =
            listRoles(params, RequestOptions.none())

        /** @see listRoles */
        @MustBeClosed
        fun listRoles(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging> =
            listRoles(UserListRolesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /settings/users/2026-03/teams`, but is otherwise the
         * same as [UserService.listTeams].
         */
        @MustBeClosed
        fun listTeams(): HttpResponseFor<CollectionResponsePublicTeamNoPaging> =
            listTeams(UserListTeamsParams.none())

        /** @see listTeams */
        @MustBeClosed
        fun listTeams(
            params: UserListTeamsParams = UserListTeamsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicTeamNoPaging>

        /** @see listTeams */
        @MustBeClosed
        fun listTeams(
            params: UserListTeamsParams = UserListTeamsParams.none()
        ): HttpResponseFor<CollectionResponsePublicTeamNoPaging> =
            listTeams(params, RequestOptions.none())

        /** @see listTeams */
        @MustBeClosed
        fun listTeams(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicTeamNoPaging> =
            listTeams(UserListTeamsParams.none(), requestOptions)
    }
}
