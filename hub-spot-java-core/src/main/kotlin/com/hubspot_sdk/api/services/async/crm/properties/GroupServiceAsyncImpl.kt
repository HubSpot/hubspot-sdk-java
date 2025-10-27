// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.properties

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
import com.hubspot_sdk.api.models.crm.properties.CollectionResponsePropertyGroup
import com.hubspot_sdk.api.models.crm.properties.CreatedResponsePropertyGroup
import com.hubspot_sdk.api.models.crm.properties.PropertyGroup
import com.hubspot_sdk.api.models.crm.properties.groups.GroupCreateParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupDeleteParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupGetParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupListParams
import com.hubspot_sdk.api.models.crm.properties.groups.GroupUpdateParams
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
    ): CompletableFuture<CreatedResponsePropertyGroup> =
        // post /crm/v3/properties/{objectType}/groups
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyGroup> =
        // patch /crm/v3/properties/{objectType}/groups/{groupName}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: GroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePropertyGroup> =
        // get /crm/v3/properties/{objectType}/groups
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/v3/properties/{objectType}/groups/{groupName}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: GroupGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyGroup> =
        // get /crm/v3/properties/{objectType}/groups/{groupName}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

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

        private val createHandler: Handler<CreatedResponsePropertyGroup> =
            jsonHandler<CreatedResponsePropertyGroup>(clientOptions.jsonMapper)

        override fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreatedResponsePropertyGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "properties", params._pathParam(0), "groups")
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

        private val updateHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun update(
            params: GroupUpdateParams,
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
                        "crm",
                        "v3",
                        "properties",
                        params._pathParam(0),
                        "groups",
                        params._pathParam(1),
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponsePropertyGroup> =
            jsonHandler<CollectionResponsePropertyGroup>(clientOptions.jsonMapper)

        override fun list(
            params: GroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "properties", params._pathParam(0), "groups")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: GroupDeleteParams,
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
                        "crm",
                        "v3",
                        "properties",
                        params._pathParam(0),
                        "groups",
                        params._pathParam(1),
                    )
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

        private val getHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun get(
            params: GroupGetParams,
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
                        "crm",
                        "v3",
                        "properties",
                        params._pathParam(0),
                        "groups",
                        params._pathParam(1),
                    )
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
    }
}
