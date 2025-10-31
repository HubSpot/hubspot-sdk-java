// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.settings.users.CollectionResponsePublicPermissionSetNoPaging
import com.hubspot_sdk.api.models.settings.users.CollectionResponsePublicTeamNoPaging
import com.hubspot_sdk.api.models.settings.users.CollectionResponsePublicUserForwardPaging
import com.hubspot_sdk.api.models.settings.users.PublicUser
import com.hubspot_sdk.api.models.settings.users.UserCreateParams
import com.hubspot_sdk.api.models.settings.users.UserDeleteParams
import com.hubspot_sdk.api.models.settings.users.UserGetParams
import com.hubspot_sdk.api.models.settings.users.UserListPage
import com.hubspot_sdk.api.models.settings.users.UserListParams
import com.hubspot_sdk.api.models.settings.users.UserListRolesParams
import com.hubspot_sdk.api.models.settings.users.UserListTeamsParams
import com.hubspot_sdk.api.models.settings.users.UserUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: UserCreateParams, requestOptions: RequestOptions): PublicUser =
        // post /settings/v3/users/
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: UserUpdateParams, requestOptions: RequestOptions): PublicUser =
        // put /settings/v3/users/{userId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: UserListParams, requestOptions: RequestOptions): UserListPage =
        // get /settings/v3/users/
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: UserDeleteParams, requestOptions: RequestOptions) {
        // delete /settings/v3/users/{userId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: UserGetParams, requestOptions: RequestOptions): PublicUser =
        // get /settings/v3/users/{userId}
        withRawResponse().get(params, requestOptions).parse()

    override fun listRoles(
        params: UserListRolesParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicPermissionSetNoPaging =
        // get /settings/v3/users/roles
        withRawResponse().listRoles(params, requestOptions).parse()

    override fun listTeams(
        params: UserListTeamsParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicTeamNoPaging =
        // get /settings/v3/users/teams
        withRawResponse().listTeams(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicUser> =
            jsonHandler<PublicUser>(clientOptions.jsonMapper)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicUser> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "users", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<PublicUser> =
            jsonHandler<PublicUser>(clientOptions.jsonMapper)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicUser> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "users", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponsePublicUserForwardPaging> =
            jsonHandler<CollectionResponsePublicUserForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "users", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        UserListPage.builder()
                            .service(UserServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "users", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<PublicUser> =
            jsonHandler<PublicUser>(clientOptions.jsonMapper)

        override fun get(
            params: UserGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicUser> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "users", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRolesHandler: Handler<CollectionResponsePublicPermissionSetNoPaging> =
            jsonHandler<CollectionResponsePublicPermissionSetNoPaging>(clientOptions.jsonMapper)

        override fun listRoles(
            params: UserListRolesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "users", "roles")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRolesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listTeamsHandler: Handler<CollectionResponsePublicTeamNoPaging> =
            jsonHandler<CollectionResponsePublicTeamNoPaging>(clientOptions.jsonMapper)

        override fun listTeams(
            params: UserListTeamsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicTeamNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "v3", "users", "teams")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTeamsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
