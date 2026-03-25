// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

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
import com.hubspot_sdk.api.models.ActionResponse
import com.hubspot_sdk.api.models.crm.imports.CollectionResponsePublicImportErrorForwardPaging
import com.hubspot_sdk.api.models.crm.imports.CollectionResponsePublicImportResponseForwardPaging
import com.hubspot_sdk.api.models.crm.imports.ImportCancelParams
import com.hubspot_sdk.api.models.crm.imports.ImportCreateParams
import com.hubspot_sdk.api.models.crm.imports.ImportGetParams
import com.hubspot_sdk.api.models.crm.imports.ImportListErrorsPage
import com.hubspot_sdk.api.models.crm.imports.ImportListErrorsParams
import com.hubspot_sdk.api.models.crm.imports.ImportListPage
import com.hubspot_sdk.api.models.crm.imports.ImportListParams
import com.hubspot_sdk.api.models.crm.imports.PublicImportResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ImportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ImportService {

    private val withRawResponse: ImportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ImportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImportService =
        ImportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ImportCreateParams,
        requestOptions: RequestOptions,
    ): PublicImportResponse =
        // post /crm/imports/2026-03
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: ImportListParams, requestOptions: RequestOptions): ImportListPage =
        // get /crm/imports/2026-03
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: ImportCancelParams,
        requestOptions: RequestOptions,
    ): ActionResponse =
        // post /crm/imports/2026-03/{importId}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun get(
        params: ImportGetParams,
        requestOptions: RequestOptions,
    ): PublicImportResponse =
        // get /crm/imports/2026-03/{importId}
        withRawResponse().get(params, requestOptions).parse()

    override fun listErrors(
        params: ImportListErrorsParams,
        requestOptions: RequestOptions,
    ): ImportListErrorsPage =
        // get /crm/imports/2026-03/{importId}/errors
        withRawResponse().listErrors(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ImportService.WithRawResponse =
            ImportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicImportResponse> =
            jsonHandler<PublicImportResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ImportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicImportResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<CollectionResponsePublicImportResponseForwardPaging> =
            jsonHandler<CollectionResponsePublicImportResponseForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: ImportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImportListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03")
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
                        ImportListPage.builder()
                            .service(ImportServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<ActionResponse> =
            jsonHandler<ActionResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: ImportCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("importId", params.importId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<PublicImportResponse> =
            jsonHandler<PublicImportResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ImportGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicImportResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("importId", params.importId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03", params._pathParam(0))
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

        private val listErrorsHandler: Handler<CollectionResponsePublicImportErrorForwardPaging> =
            jsonHandler<CollectionResponsePublicImportErrorForwardPaging>(clientOptions.jsonMapper)

        override fun listErrors(
            params: ImportListErrorsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImportListErrorsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("importId", params.importId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03", params._pathParam(0), "errors")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listErrorsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ImportListErrorsPage.builder()
                            .service(ImportServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
