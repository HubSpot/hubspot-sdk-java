// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

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
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyCreateParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyDeleteParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyGetParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyListPage
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyListParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyMergeParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanySearchParams
import com.hubspot_sdk.api.models.crm.objects.companies.CompanyUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.companies.BatchService
import com.hubspot_sdk.api.services.blocking.crm.objects.companies.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CompanyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyService {

    private val withRawResponse: CompanyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): CompanyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService =
        CompanyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun create(
        params: CompanyCreateParams,
        requestOptions: RequestOptions,
    ): SimplePublicObject =
        // post /crm/objects/2026-03/companies
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CompanyUpdateParams,
        requestOptions: RequestOptions,
    ): SimplePublicObject =
        // patch /crm/objects/2026-03/companies/{companyId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: CompanyListParams, requestOptions: RequestOptions): CompanyListPage =
        // get /crm/objects/2026-03/companies
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CompanyDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/objects/2026-03/companies/{companyId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: CompanyGetParams,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        // get /crm/objects/2026-03/companies/{companyId}
        withRawResponse().get(params, requestOptions).parse()

    override fun merge(
        params: CompanyMergeParams,
        requestOptions: RequestOptions,
    ): SimplePublicObject =
        // post /crm/objects/2026-03/companies/merge
        withRawResponse().merge(params, requestOptions).parse()

    override fun search(
        params: CompanySearchParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalSimplePublicObject =
        // post /crm/objects/2026-03/companies/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompanyService.WithRawResponse =
            CompanyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val createHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun create(
            params: CompanyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "companies")
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

        private val updateHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun update(
            params: CompanyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObject> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "companies", params._pathParam(0))
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

        private val listHandler:
            Handler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging> =
            jsonHandler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: CompanyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "companies")
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
                        CompanyListPage.builder()
                            .service(CompanyServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CompanyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "companies", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SimplePublicObjectWithAssociations> =
            jsonHandler<SimplePublicObjectWithAssociations>(clientOptions.jsonMapper)

        override fun get(
            params: CompanyGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "companies", params._pathParam(0))
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

        private val mergeHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun merge(
            params: CompanyMergeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "companies", "merge")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { mergeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<CollectionResponseWithTotalSimplePublicObject> =
            jsonHandler<CollectionResponseWithTotalSimplePublicObject>(clientOptions.jsonMapper)

        override fun search(
            params: CompanySearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "companies", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
