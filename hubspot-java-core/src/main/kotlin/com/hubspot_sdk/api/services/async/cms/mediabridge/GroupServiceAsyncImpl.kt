// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupDeleteByNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupGetByNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupListParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupListResponse
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupUpdateByNameParams
import com.hubspot_sdk.api.models.crm.properties.PropertyGroup
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GroupServiceAsync {

    private val withRawResponse: GroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GroupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync =
        GroupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyGroup> =
        // post /media-bridge/v1/{appId}/properties/{objectType}/groups
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: GroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GroupListResponse> =
        // get /media-bridge/v1/{appId}/properties/{objectType}/groups
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deleteByName(
        params: GroupDeleteByNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().deleteByName(params, requestOptions).thenAccept {}

    override fun getByName(
        params: GroupGetByNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyGroup> =
        // get /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().getByName(params, requestOptions).thenApply { it.parse() }

    override fun updateByName(
        params: GroupUpdateByNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyGroup> =
        // patch /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().updateByName(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse =
            GroupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                    )
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

        private val listHandler: Handler<GroupListResponse> =
            jsonHandler<GroupListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GroupListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                    )
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
                    }
                }
        }

        private val deleteByNameHandler: Handler<Void?> = emptyHandler()

        override fun deleteByName(
            params: GroupDeleteByNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupName", params.groupName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteByNameHandler.handle(it) }
                    }
                }
        }

        private val getByNameHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun getByName(
            params: GroupGetByNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupName", params.groupName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                        params._pathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByNameHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateByNameHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun updateByName(
            params: GroupUpdateByNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupName", params.groupName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                        params._pathParam(2),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateByNameHandler.handle(it) }
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
