// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.datastudio

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.datastudio.datasource.DataSourceGetResponse
import com.hubspot_sdk.api.models.datastudio.datasource.DataSourceUpdateResponse
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceCreateParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceDeleteParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceGetParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DatasourceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasourceService {

    private val withRawResponse: DatasourceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasourceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasourceService =
        DatasourceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DatasourceCreateParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /data-studio/2026-03/data-source
        withRawResponse().create(params, requestOptions)

    override fun update(
        params: DatasourceUpdateParams,
        requestOptions: RequestOptions,
    ): DataSourceUpdateResponse =
        // put /data-studio/2026-03/data-source/{datasourceId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: DatasourceDeleteParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // delete /data-studio/2026-03/data-source/{datasourceId}
        withRawResponse().delete(params, requestOptions)

    override fun get(
        params: DatasourceGetParams,
        requestOptions: RequestOptions,
    ): DataSourceGetResponse =
        // get /data-studio/2026-03/data-source/{datasourceId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasourceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasourceService.WithRawResponse =
            DatasourceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun create(
            params: DatasourceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data-studio", "2026-03", "data-source")
                    .putHeader("Accept", "*/*")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val updateHandler: Handler<DataSourceUpdateResponse> =
            jsonHandler<DataSourceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DatasourceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSourceUpdateResponse> {
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

        override fun delete(
            params: DatasourceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getHandler: Handler<DataSourceGetResponse> =
            jsonHandler<DataSourceGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: DatasourceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSourceGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasourceId", params.datasourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data-studio", "2026-03", "data-source", params._pathParam(0))
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
    }
}
