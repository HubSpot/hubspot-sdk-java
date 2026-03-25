// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.datastudio

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.multipartFormData
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.datastudio.datasource.DataSourceGetResponse
import com.hubspot_sdk.api.models.datastudio.datasource.DataSourceUpdateResponse
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceCreateParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceDeleteParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceGetParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DatasourceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasourceServiceAsync {

    private val withRawResponse: DatasourceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasourceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasourceServiceAsync =
        DatasourceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DatasourceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /data-studio/2026-03/data-source
        withRawResponse().create(params, requestOptions)

    override fun update(
        params: DatasourceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataSourceUpdateResponse> =
        // put /data-studio/2026-03/data-source/{datasourceId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DatasourceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // delete /data-studio/2026-03/data-source/{datasourceId}
        withRawResponse().delete(params, requestOptions)

    override fun get(
        params: DatasourceGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataSourceGetResponse> =
        // get /data-studio/2026-03/data-source/{datasourceId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasourceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasourceServiceAsync.WithRawResponse =
            DatasourceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun create(
            params: DatasourceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data-studio", "2026-03", "data-source")
                    .putHeader("Accept", "*/*")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val updateHandler: Handler<DataSourceUpdateResponse> =
            jsonHandler<DataSourceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DatasourceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataSourceUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasourceId", params.datasourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data-studio", "2026-03", "data-source", params._pathParam(0))
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        override fun delete(
            params: DatasourceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasourceId", params.datasourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data-studio", "2026-03", "data-source", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val getHandler: Handler<DataSourceGetResponse> =
            jsonHandler<DataSourceGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: DatasourceGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataSourceGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasourceId", params.datasourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data-studio", "2026-03", "data-source", params._pathParam(0))
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
