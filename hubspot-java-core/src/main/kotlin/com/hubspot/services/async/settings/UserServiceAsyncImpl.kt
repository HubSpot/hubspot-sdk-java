// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.settings

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.settings.users.CollectionResponsePublicPermissionSetNoPaging
import com.hubspot.models.settings.users.CollectionResponsePublicTeamNoPaging
import com.hubspot.models.settings.users.CollectionResponsePublicUserForwardPaging
import com.hubspot.models.settings.users.PublicUser
import com.hubspot.models.settings.users.UserCreateParams
import com.hubspot.models.settings.users.UserDeleteParams
import com.hubspot.models.settings.users.UserGetParams
import com.hubspot.models.settings.users.UserListPageAsync
import com.hubspot.models.settings.users.UserListParams
import com.hubspot.models.settings.users.UserListRolesParams
import com.hubspot.models.settings.users.UserListTeamsParams
import com.hubspot.models.settings.users.UserUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicUser> =
        // post /settings/users/2026-03
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicUser> =
        // put /settings/users/2026-03/{userId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UserListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserListPageAsync> =
        // get /settings/users/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /settings/users/2026-03/{userId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: UserGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicUser> =
        // get /settings/users/2026-03/{userId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun listRoles(
        params: UserListRolesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicPermissionSetNoPaging> =
        // get /settings/users/2026-03/roles
        withRawResponse().listRoles(params, requestOptions).thenApply { it.parse() }

    override fun listTeams(
        params: UserListTeamsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicTeamNoPaging> =
        // get /settings/users/2026-03/teams
        withRawResponse().listTeams(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicUser> =
            jsonHandler<PublicUser>(clientOptions.jsonMapper)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicUser>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "users", "2026-03")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PublicUser> =
            jsonHandler<PublicUser>(clientOptions.jsonMapper)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicUser>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "users", "2026-03", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponsePublicUserForwardPaging> =
            jsonHandler<CollectionResponsePublicUserForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "users", "2026-03")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                UserListPageAsync.builder()
                                    .service(UserServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "users", "2026-03", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<PublicUser> =
            jsonHandler<PublicUser>(clientOptions.jsonMapper)

        override fun get(
            params: UserGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicUser>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "users", "2026-03", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRolesHandler: Handler<CollectionResponsePublicPermissionSetNoPaging> =
            jsonHandler<CollectionResponsePublicPermissionSetNoPaging>(clientOptions.jsonMapper)

        override fun listRoles(
            params: UserListRolesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicPermissionSetNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "users", "2026-03", "roles")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRolesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listTeamsHandler: Handler<CollectionResponsePublicTeamNoPaging> =
            jsonHandler<CollectionResponsePublicTeamNoPaging>(clientOptions.jsonMapper)

        override fun listTeams(
            params: UserListTeamsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicTeamNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("settings", "users", "2026-03", "teams")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
