// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

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
import com.hubspot.core.prepare
import com.hubspot.models.crm.lists.ApiCollectionResponseJoinTimeAndRecordId
import com.hubspot.models.crm.lists.ApiCollectionResponseRecordListMembership
import com.hubspot.models.crm.lists.BatchResponseRecordIdWithMemberships
import com.hubspot.models.crm.lists.ListAddAndRemoveMembershipsParams
import com.hubspot.models.crm.lists.ListAddMembershipsFromParams
import com.hubspot.models.crm.lists.ListAddMembershipsParams
import com.hubspot.models.crm.lists.ListBatchReadMembershipsParams
import com.hubspot.models.crm.lists.ListCreateFolderParams
import com.hubspot.models.crm.lists.ListCreateIdMappingParams
import com.hubspot.models.crm.lists.ListCreateParams
import com.hubspot.models.crm.lists.ListCreateResponse
import com.hubspot.models.crm.lists.ListDeleteFolderParams
import com.hubspot.models.crm.lists.ListDeleteMembershipsParams
import com.hubspot.models.crm.lists.ListDeleteParams
import com.hubspot.models.crm.lists.ListFetchResponse
import com.hubspot.models.crm.lists.ListFolderCreateResponse
import com.hubspot.models.crm.lists.ListFolderFetchResponse
import com.hubspot.models.crm.lists.ListGetByObjectTypeAndNameParams
import com.hubspot.models.crm.lists.ListGetIdMappingParams
import com.hubspot.models.crm.lists.ListGetMembershipsJoinOrderPage
import com.hubspot.models.crm.lists.ListGetMembershipsJoinOrderParams
import com.hubspot.models.crm.lists.ListGetParams
import com.hubspot.models.crm.lists.ListGetRecordMembershipsParams
import com.hubspot.models.crm.lists.ListGetScheduleConversionParams
import com.hubspot.models.crm.lists.ListGetSizeAndEditsHistoryBetweenParams
import com.hubspot.models.crm.lists.ListListBySearchParams
import com.hubspot.models.crm.lists.ListListFoldersParams
import com.hubspot.models.crm.lists.ListListMembershipsPage
import com.hubspot.models.crm.lists.ListListMembershipsParams
import com.hubspot.models.crm.lists.ListListParams
import com.hubspot.models.crm.lists.ListMoveFolderParams
import com.hubspot.models.crm.lists.ListMoveListParams
import com.hubspot.models.crm.lists.ListRemoveMembershipsParams
import com.hubspot.models.crm.lists.ListRenameFolderParams
import com.hubspot.models.crm.lists.ListRestoreParams
import com.hubspot.models.crm.lists.ListScheduleConversionParams
import com.hubspot.models.crm.lists.ListSearchResponse
import com.hubspot.models.crm.lists.ListSizeAndEditHistoryResponse
import com.hubspot.models.crm.lists.ListUpdateListFiltersParams
import com.hubspot.models.crm.lists.ListUpdateListNameParams
import com.hubspot.models.crm.lists.ListUpdateResponse
import com.hubspot.models.crm.lists.ListUpdateScheduleConversionParams
import com.hubspot.models.crm.lists.ListsByIdResponse
import com.hubspot.models.crm.lists.MembershipsUpdateResponse
import com.hubspot.models.crm.lists.PublicBatchMigrationMapping
import com.hubspot.models.crm.lists.PublicListConversionResponse
import com.hubspot.models.crm.lists.PublicMigrationMapping
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ListServiceImpl internal constructor(private val clientOptions: ClientOptions) : ListService {

    private val withRawResponse: ListService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ListService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService =
        ListServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ListCreateParams,
        requestOptions: RequestOptions,
    ): ListCreateResponse =
        // post /crm/lists/2026-03
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: ListListParams, requestOptions: RequestOptions): ListsByIdResponse =
        // get /crm/lists/2026-03
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ListDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/lists/2026-03/{listId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun addAndRemoveMemberships(
        params: ListAddAndRemoveMembershipsParams,
        requestOptions: RequestOptions,
    ): MembershipsUpdateResponse =
        // put /crm/lists/2026-03/{listId}/memberships/add-and-remove
        withRawResponse().addAndRemoveMemberships(params, requestOptions).parse()

    override fun addMemberships(
        params: ListAddMembershipsParams,
        requestOptions: RequestOptions,
    ): MembershipsUpdateResponse =
        // put /crm/lists/2026-03/{listId}/memberships/add
        withRawResponse().addMemberships(params, requestOptions).parse()

    override fun addMembershipsFrom(
        params: ListAddMembershipsFromParams,
        requestOptions: RequestOptions,
    ) {
        // put /crm/lists/2026-03/{listId}/memberships/add-from/{sourceListId}
        withRawResponse().addMembershipsFrom(params, requestOptions)
    }

    override fun batchReadMemberships(
        params: ListBatchReadMembershipsParams,
        requestOptions: RequestOptions,
    ): BatchResponseRecordIdWithMemberships =
        // post /crm/lists/2026-03/records/memberships/batch/read
        withRawResponse().batchReadMemberships(params, requestOptions).parse()

    override fun createFolder(
        params: ListCreateFolderParams,
        requestOptions: RequestOptions,
    ): ListFolderCreateResponse =
        // post /crm/lists/2026-03/folders
        withRawResponse().createFolder(params, requestOptions).parse()

    override fun createIdMapping(
        params: ListCreateIdMappingParams,
        requestOptions: RequestOptions,
    ): PublicBatchMigrationMapping =
        // post /crm/lists/2026-03/idmapping
        withRawResponse().createIdMapping(params, requestOptions).parse()

    override fun deleteFolder(params: ListDeleteFolderParams, requestOptions: RequestOptions) {
        // delete /crm/lists/2026-03/folders/{folderId}
        withRawResponse().deleteFolder(params, requestOptions)
    }

    override fun deleteMemberships(
        params: ListDeleteMembershipsParams,
        requestOptions: RequestOptions,
    ) {
        // delete /crm/lists/2026-03/{listId}/memberships
        withRawResponse().deleteMemberships(params, requestOptions)
    }

    override fun get(params: ListGetParams, requestOptions: RequestOptions): ListFetchResponse =
        // get /crm/lists/2026-03/{listId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getByObjectTypeAndName(
        params: ListGetByObjectTypeAndNameParams,
        requestOptions: RequestOptions,
    ): ListFetchResponse =
        // get /crm/lists/2026-03/object-type-id/{objectTypeId}/name/{listName}
        withRawResponse().getByObjectTypeAndName(params, requestOptions).parse()

    override fun getIdMapping(
        params: ListGetIdMappingParams,
        requestOptions: RequestOptions,
    ): PublicMigrationMapping =
        // get /crm/lists/2026-03/idmapping
        withRawResponse().getIdMapping(params, requestOptions).parse()

    override fun getMembershipsJoinOrder(
        params: ListGetMembershipsJoinOrderParams,
        requestOptions: RequestOptions,
    ): ListGetMembershipsJoinOrderPage =
        // get /crm/lists/2026-03/{listId}/memberships/join-order
        withRawResponse().getMembershipsJoinOrder(params, requestOptions).parse()

    override fun getRecordMemberships(
        params: ListGetRecordMembershipsParams,
        requestOptions: RequestOptions,
    ): ApiCollectionResponseRecordListMembership =
        // get /crm/lists/2026-03/records/{objectTypeId}/{recordId}/memberships
        withRawResponse().getRecordMemberships(params, requestOptions).parse()

    override fun getScheduleConversion(
        params: ListGetScheduleConversionParams,
        requestOptions: RequestOptions,
    ): PublicListConversionResponse =
        // get /crm/lists/2026-03/{listId}/schedule-conversion
        withRawResponse().getScheduleConversion(params, requestOptions).parse()

    override fun getSizeAndEditsHistoryBetween(
        params: ListGetSizeAndEditsHistoryBetweenParams,
        requestOptions: RequestOptions,
    ): ListSizeAndEditHistoryResponse =
        // get /crm/lists/2026-03/{listId}/size-and-edits-history/between
        withRawResponse().getSizeAndEditsHistoryBetween(params, requestOptions).parse()

    override fun listBySearch(
        params: ListListBySearchParams,
        requestOptions: RequestOptions,
    ): ListSearchResponse =
        // post /crm/lists/2026-03/search
        withRawResponse().listBySearch(params, requestOptions).parse()

    override fun listFolders(
        params: ListListFoldersParams,
        requestOptions: RequestOptions,
    ): ListFolderFetchResponse =
        // get /crm/lists/2026-03/folders
        withRawResponse().listFolders(params, requestOptions).parse()

    override fun listMemberships(
        params: ListListMembershipsParams,
        requestOptions: RequestOptions,
    ): ListListMembershipsPage =
        // get /crm/lists/2026-03/{listId}/memberships
        withRawResponse().listMemberships(params, requestOptions).parse()

    override fun moveFolder(
        params: ListMoveFolderParams,
        requestOptions: RequestOptions,
    ): ListFolderFetchResponse =
        // put /crm/lists/2026-03/folders/{folderId}/move/{newParentFolderId}
        withRawResponse().moveFolder(params, requestOptions).parse()

    override fun moveList(params: ListMoveListParams, requestOptions: RequestOptions) {
        // put /crm/lists/2026-03/folders/move-list
        withRawResponse().moveList(params, requestOptions)
    }

    override fun removeMemberships(
        params: ListRemoveMembershipsParams,
        requestOptions: RequestOptions,
    ): MembershipsUpdateResponse =
        // put /crm/lists/2026-03/{listId}/memberships/remove
        withRawResponse().removeMemberships(params, requestOptions).parse()

    override fun renameFolder(
        params: ListRenameFolderParams,
        requestOptions: RequestOptions,
    ): ListFolderFetchResponse =
        // put /crm/lists/2026-03/folders/{folderId}/rename
        withRawResponse().renameFolder(params, requestOptions).parse()

    override fun restore(params: ListRestoreParams, requestOptions: RequestOptions) {
        // put /crm/lists/2026-03/{listId}/restore
        withRawResponse().restore(params, requestOptions)
    }

    override fun scheduleConversion(
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions,
    ) {
        // delete /crm/lists/2026-03/{listId}/schedule-conversion
        withRawResponse().scheduleConversion(params, requestOptions)
    }

    override fun updateListFilters(
        params: ListUpdateListFiltersParams,
        requestOptions: RequestOptions,
    ): ListUpdateResponse =
        // put /crm/lists/2026-03/{listId}/update-list-filters
        withRawResponse().updateListFilters(params, requestOptions).parse()

    override fun updateListName(
        params: ListUpdateListNameParams,
        requestOptions: RequestOptions,
    ): ListUpdateResponse =
        // put /crm/lists/2026-03/{listId}/update-list-name
        withRawResponse().updateListName(params, requestOptions).parse()

    override fun updateScheduleConversion(
        params: ListUpdateScheduleConversionParams,
        requestOptions: RequestOptions,
    ): PublicListConversionResponse =
        // put /crm/lists/2026-03/{listId}/schedule-conversion
        withRawResponse().updateScheduleConversion(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListService.WithRawResponse =
            ListServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

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
                    .addPathSegments("crm", "lists", "2026-03")
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
                    .addPathSegments("crm", "lists", "2026-03")
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
                    .addPathSegments("crm", "lists", "2026-03", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val addAndRemoveMembershipsHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun addAndRemoveMemberships(
            params: ListAddAndRemoveMembershipsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MembershipsUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        params._pathParam(0),
                        "memberships",
                        "add-and-remove",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addAndRemoveMembershipsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addMembershipsHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun addMemberships(
            params: ListAddMembershipsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MembershipsUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        params._pathParam(0),
                        "memberships",
                        "add",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addMembershipsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addMembershipsFromHandler: Handler<Void?> = emptyHandler()

        override fun addMembershipsFrom(
            params: ListAddMembershipsFromParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sourceListId", params.sourceListId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        params._pathParam(0),
                        "memberships",
                        "add-from",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { addMembershipsFromHandler.handle(it) }
            }
        }

        private val batchReadMembershipsHandler: Handler<BatchResponseRecordIdWithMemberships> =
            jsonHandler<BatchResponseRecordIdWithMemberships>(clientOptions.jsonMapper)

        override fun batchReadMemberships(
            params: ListBatchReadMembershipsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseRecordIdWithMemberships> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        "records",
                        "memberships",
                        "batch",
                        "read",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchReadMembershipsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createFolderHandler: Handler<ListFolderCreateResponse> =
            jsonHandler<ListFolderCreateResponse>(clientOptions.jsonMapper)

        override fun createFolder(
            params: ListCreateFolderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFolderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "folders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createFolderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createIdMappingHandler: Handler<PublicBatchMigrationMapping> =
            jsonHandler<PublicBatchMigrationMapping>(clientOptions.jsonMapper)

        override fun createIdMapping(
            params: ListCreateIdMappingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicBatchMigrationMapping> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "idmapping")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createIdMappingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteFolderHandler: Handler<Void?> = emptyHandler()

        override fun deleteFolder(
            params: ListDeleteFolderParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderId", params.folderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "folders", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteFolderHandler.handle(it) }
            }
        }

        private val deleteMembershipsHandler: Handler<Void?> = emptyHandler()

        override fun deleteMemberships(
            params: ListDeleteMembershipsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", params._pathParam(0), "memberships")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteMembershipsHandler.handle(it) }
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
                    .addPathSegments("crm", "lists", "2026-03", params._pathParam(0))
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

        private val getByObjectTypeAndNameHandler: Handler<ListFetchResponse> =
            jsonHandler<ListFetchResponse>(clientOptions.jsonMapper)

        override fun getByObjectTypeAndName(
            params: ListGetByObjectTypeAndNameParams,
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
                        "lists",
                        "2026-03",
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
                    .use { getByObjectTypeAndNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getIdMappingHandler: Handler<PublicMigrationMapping> =
            jsonHandler<PublicMigrationMapping>(clientOptions.jsonMapper)

        override fun getIdMapping(
            params: ListGetIdMappingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicMigrationMapping> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "idmapping")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getIdMappingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getMembershipsJoinOrderHandler:
            Handler<ApiCollectionResponseJoinTimeAndRecordId> =
            jsonHandler<ApiCollectionResponseJoinTimeAndRecordId>(clientOptions.jsonMapper)

        override fun getMembershipsJoinOrder(
            params: ListGetMembershipsJoinOrderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListGetMembershipsJoinOrderPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        params._pathParam(0),
                        "memberships",
                        "join-order",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getMembershipsJoinOrderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ListGetMembershipsJoinOrderPage.builder()
                            .service(ListServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getRecordMembershipsHandler:
            Handler<ApiCollectionResponseRecordListMembership> =
            jsonHandler<ApiCollectionResponseRecordListMembership>(clientOptions.jsonMapper)

        override fun getRecordMemberships(
            params: ListGetRecordMembershipsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiCollectionResponseRecordListMembership> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordId", params.recordId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        "records",
                        params._pathParam(0),
                        params._pathParam(1),
                        "memberships",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRecordMembershipsHandler.handle(it) }
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
                        "lists",
                        "2026-03",
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

        private val getSizeAndEditsHistoryBetweenHandler: Handler<ListSizeAndEditHistoryResponse> =
            jsonHandler<ListSizeAndEditHistoryResponse>(clientOptions.jsonMapper)

        override fun getSizeAndEditsHistoryBetween(
            params: ListGetSizeAndEditsHistoryBetweenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListSizeAndEditHistoryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        params._pathParam(0),
                        "size-and-edits-history",
                        "between",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSizeAndEditsHistoryBetweenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBySearchHandler: Handler<ListSearchResponse> =
            jsonHandler<ListSearchResponse>(clientOptions.jsonMapper)

        override fun listBySearch(
            params: ListListBySearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBySearchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listFoldersHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun listFolders(
            params: ListListFoldersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFolderFetchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "folders")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listFoldersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listMembershipsHandler: Handler<ApiCollectionResponseJoinTimeAndRecordId> =
            jsonHandler<ApiCollectionResponseJoinTimeAndRecordId>(clientOptions.jsonMapper)

        override fun listMemberships(
            params: ListListMembershipsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListListMembershipsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", params._pathParam(0), "memberships")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listMembershipsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ListListMembershipsPage.builder()
                            .service(ListServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val moveFolderHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun moveFolder(
            params: ListMoveFolderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFolderFetchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("newParentFolderId", params.newParentFolderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        "folders",
                        params._pathParam(0),
                        "move",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { moveFolderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val moveListHandler: Handler<Void?> = emptyHandler()

        override fun moveList(
            params: ListMoveListParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "folders", "move-list")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { moveListHandler.handle(it) }
            }
        }

        private val removeMembershipsHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun removeMemberships(
            params: ListRemoveMembershipsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MembershipsUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        params._pathParam(0),
                        "memberships",
                        "remove",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removeMembershipsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val renameFolderHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun renameFolder(
            params: ListRenameFolderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFolderFetchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderId", params.folderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "lists",
                        "2026-03",
                        "folders",
                        params._pathParam(0),
                        "rename",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { renameFolderHandler.handle(it) }
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
                    .addPathSegments("crm", "lists", "2026-03", params._pathParam(0), "restore")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { restoreHandler.handle(it) }
            }
        }

        private val scheduleConversionHandler: Handler<Void?> = emptyHandler()

        override fun scheduleConversion(
            params: ListScheduleConversionParams,
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
                        "lists",
                        "2026-03",
                        params._pathParam(0),
                        "schedule-conversion",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { scheduleConversionHandler.handle(it) }
            }
        }

        private val updateListFiltersHandler: Handler<ListUpdateResponse> =
            jsonHandler<ListUpdateResponse>(clientOptions.jsonMapper)

        override fun updateListFilters(
            params: ListUpdateListFiltersParams,
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
                        "lists",
                        "2026-03",
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
                    .use { updateListFiltersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateListNameHandler: Handler<ListUpdateResponse> =
            jsonHandler<ListUpdateResponse>(clientOptions.jsonMapper)

        override fun updateListName(
            params: ListUpdateListNameParams,
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
                        "lists",
                        "2026-03",
                        params._pathParam(0),
                        "update-list-name",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateListNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateScheduleConversionHandler: Handler<PublicListConversionResponse> =
            jsonHandler<PublicListConversionResponse>(clientOptions.jsonMapper)

        override fun updateScheduleConversion(
            params: ListUpdateScheduleConversionParams,
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
                        "lists",
                        "2026-03",
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
                    .use { updateScheduleConversionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
