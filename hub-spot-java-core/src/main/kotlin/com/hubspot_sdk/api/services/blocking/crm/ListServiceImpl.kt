// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

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
import com.hubspot_sdk.api.models.crm.lists.ListCreateParams
import com.hubspot_sdk.api.models.crm.lists.ListCreateResponse
import com.hubspot_sdk.api.models.crm.lists.ListDeleteParams
import com.hubspot_sdk.api.models.crm.lists.ListDeleteScheduleConversionParams
import com.hubspot_sdk.api.models.crm.lists.ListFetchResponse
import com.hubspot_sdk.api.models.crm.lists.ListGetByObjectTypeIdAndNameParams
import com.hubspot_sdk.api.models.crm.lists.ListGetParams
import com.hubspot_sdk.api.models.crm.lists.ListGetScheduleConversionParams
import com.hubspot_sdk.api.models.crm.lists.ListListParams
import com.hubspot_sdk.api.models.crm.lists.ListRestoreParams
import com.hubspot_sdk.api.models.crm.lists.ListScheduleConversionParams
import com.hubspot_sdk.api.models.crm.lists.ListSearchParams
import com.hubspot_sdk.api.models.crm.lists.ListSearchResponse
import com.hubspot_sdk.api.models.crm.lists.ListUpdateFiltersParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateNameParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateResponse
import com.hubspot_sdk.api.models.crm.lists.ListsByIdResponse
import com.hubspot_sdk.api.models.crm.lists.PublicListConversionResponse
import com.hubspot_sdk.api.services.blocking.crm.lists.FolderService
import com.hubspot_sdk.api.services.blocking.crm.lists.FolderServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.lists.MappingService
import com.hubspot_sdk.api.services.blocking.crm.lists.MappingServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.lists.MembershipService
import com.hubspot_sdk.api.services.blocking.crm.lists.MembershipServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ListServiceImpl internal constructor(private val clientOptions: ClientOptions) : ListService {

    private val withRawResponse: ListService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val folders: FolderService by lazy { FolderServiceImpl(clientOptions) }

    private val mapping: MappingService by lazy { MappingServiceImpl(clientOptions) }

    private val memberships: MembershipService by lazy { MembershipServiceImpl(clientOptions) }

    override fun withRawResponse(): ListService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService =
        ListServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun folders(): FolderService = folders

    override fun mapping(): MappingService = mapping

    override fun memberships(): MembershipService = memberships

    override fun create(
        params: ListCreateParams,
        requestOptions: RequestOptions,
    ): ListCreateResponse =
        // post /crm/v3/lists/
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: ListListParams, requestOptions: RequestOptions): ListsByIdResponse =
        // get /crm/v3/lists/
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ListDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/v3/lists/{listId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun deleteScheduleConversion(
        params: ListDeleteScheduleConversionParams,
        requestOptions: RequestOptions,
    ) {
        // delete /crm/v3/lists/{listId}/schedule-conversion
        withRawResponse().deleteScheduleConversion(params, requestOptions)
    }

    override fun get(params: ListGetParams, requestOptions: RequestOptions): ListFetchResponse =
        // get /crm/v3/lists/{listId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getByObjectTypeIdAndName(
        params: ListGetByObjectTypeIdAndNameParams,
        requestOptions: RequestOptions,
    ): ListFetchResponse =
        // get /crm/v3/lists/object-type-id/{objectTypeId}/name/{listName}
        withRawResponse().getByObjectTypeIdAndName(params, requestOptions).parse()

    override fun getScheduleConversion(
        params: ListGetScheduleConversionParams,
        requestOptions: RequestOptions,
    ): PublicListConversionResponse =
        // get /crm/v3/lists/{listId}/schedule-conversion
        withRawResponse().getScheduleConversion(params, requestOptions).parse()

    override fun restore(params: ListRestoreParams, requestOptions: RequestOptions) {
        // put /crm/v3/lists/{listId}/restore
        withRawResponse().restore(params, requestOptions)
    }

    override fun scheduleConversion(
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions,
    ): PublicListConversionResponse =
        // put /crm/v3/lists/{listId}/schedule-conversion
        withRawResponse().scheduleConversion(params, requestOptions).parse()

    override fun search(
        params: ListSearchParams,
        requestOptions: RequestOptions,
    ): ListSearchResponse =
        // post /crm/v3/lists/search
        withRawResponse().search(params, requestOptions).parse()

    override fun updateFilters(
        params: ListUpdateFiltersParams,
        requestOptions: RequestOptions,
    ): ListUpdateResponse =
        // put /crm/v3/lists/{listId}/update-list-filters
        withRawResponse().updateFilters(params, requestOptions).parse()

    override fun updateName(
        params: ListUpdateNameParams,
        requestOptions: RequestOptions,
    ): ListUpdateResponse =
        // put /crm/v3/lists/{listId}/update-list-name
        withRawResponse().updateName(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val folders: FolderService.WithRawResponse by lazy {
            FolderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mapping: MappingService.WithRawResponse by lazy {
            MappingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val memberships: MembershipService.WithRawResponse by lazy {
            MembershipServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListService.WithRawResponse =
            ListServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun folders(): FolderService.WithRawResponse = folders

        override fun mapping(): MappingService.WithRawResponse = mapping

        override fun memberships(): MembershipService.WithRawResponse = memberships

        private val createHandler: Handler<ListCreateResponse> =
            jsonHandler<ListCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ListCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "")
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

        private val listHandler: Handler<ListsByIdResponse> =
            jsonHandler<ListsByIdResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ListListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListsByIdResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "")
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val deleteScheduleConversionHandler: Handler<Void?> = emptyHandler()

        override fun deleteScheduleConversion(
            params: ListDeleteScheduleConversionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "schedule-conversion",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteScheduleConversionHandler.handle(it) }
            }
        }

        private val getHandler: Handler<ListFetchResponse> =
            jsonHandler<ListFetchResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ListGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFetchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", params._pathParam(0))
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

        private val getByObjectTypeIdAndNameHandler: Handler<ListFetchResponse> =
            jsonHandler<ListFetchResponse>(clientOptions.jsonMapper)

        override fun getByObjectTypeIdAndName(
            params: ListGetByObjectTypeIdAndNameParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFetchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listName", params.listName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        "object-type-id",
                        params._pathParam(0),
                        "name",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByObjectTypeIdAndNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getScheduleConversionHandler: Handler<PublicListConversionResponse> =
            jsonHandler<PublicListConversionResponse>(clientOptions.jsonMapper)

        override fun getScheduleConversion(
            params: ListGetScheduleConversionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicListConversionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "schedule-conversion",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getScheduleConversionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val restoreHandler: Handler<Void?> = emptyHandler()

        override fun restore(
            params: ListRestoreParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", params._pathParam(0), "restore")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { restoreHandler.handle(it) }
            }
        }

        private val scheduleConversionHandler: Handler<PublicListConversionResponse> =
            jsonHandler<PublicListConversionResponse>(clientOptions.jsonMapper)

        override fun scheduleConversion(
            params: ListScheduleConversionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicListConversionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "schedule-conversion",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { scheduleConversionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<ListSearchResponse> =
            jsonHandler<ListSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: ListSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "search")
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

        private val updateFiltersHandler: Handler<ListUpdateResponse> =
            jsonHandler<ListUpdateResponse>(clientOptions.jsonMapper)

        override fun updateFilters(
            params: ListUpdateFiltersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "update-list-filters",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateFiltersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateNameHandler: Handler<ListUpdateResponse> =
            jsonHandler<ListUpdateResponse>(clientOptions.jsonMapper)

        override fun updateName(
            params: ListUpdateNameParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", params._pathParam(0), "update-list-name")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
