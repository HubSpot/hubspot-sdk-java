// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

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
import com.hubspot_sdk.api.models.crm.lists.ApiCollectionResponseJoinTimeAndRecordId
import com.hubspot_sdk.api.models.crm.lists.ApiCollectionResponseRecordListMembership
import com.hubspot_sdk.api.models.crm.lists.BatchResponseRecordIdWithMemberships
import com.hubspot_sdk.api.models.crm.lists.ListAddAndRemoveMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListAddMembershipsFromParams
import com.hubspot_sdk.api.models.crm.lists.ListAddMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListBatchReadMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListCreateFolderParams
import com.hubspot_sdk.api.models.crm.lists.ListCreateIdMappingParams
import com.hubspot_sdk.api.models.crm.lists.ListCreateParams
import com.hubspot_sdk.api.models.crm.lists.ListCreateResponse
import com.hubspot_sdk.api.models.crm.lists.ListDeleteFolderParams
import com.hubspot_sdk.api.models.crm.lists.ListDeleteMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListDeleteParams
import com.hubspot_sdk.api.models.crm.lists.ListFetchResponse
import com.hubspot_sdk.api.models.crm.lists.ListFolderCreateResponse
import com.hubspot_sdk.api.models.crm.lists.ListFolderFetchResponse
import com.hubspot_sdk.api.models.crm.lists.ListGetByObjectTypeAndNameParams
import com.hubspot_sdk.api.models.crm.lists.ListGetIdMappingParams
import com.hubspot_sdk.api.models.crm.lists.ListGetMembershipsJoinOrderPageAsync
import com.hubspot_sdk.api.models.crm.lists.ListGetMembershipsJoinOrderParams
import com.hubspot_sdk.api.models.crm.lists.ListGetParams
import com.hubspot_sdk.api.models.crm.lists.ListGetRecordMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListGetScheduleConversionParams
import com.hubspot_sdk.api.models.crm.lists.ListGetSizeAndEditsHistoryBetweenParams
import com.hubspot_sdk.api.models.crm.lists.ListListBySearchParams
import com.hubspot_sdk.api.models.crm.lists.ListListFoldersParams
import com.hubspot_sdk.api.models.crm.lists.ListListMembershipsPageAsync
import com.hubspot_sdk.api.models.crm.lists.ListListMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListListParams
import com.hubspot_sdk.api.models.crm.lists.ListMoveFolderParams
import com.hubspot_sdk.api.models.crm.lists.ListMoveListParams
import com.hubspot_sdk.api.models.crm.lists.ListRemoveMembershipsParams
import com.hubspot_sdk.api.models.crm.lists.ListRenameFolderParams
import com.hubspot_sdk.api.models.crm.lists.ListRestoreParams
import com.hubspot_sdk.api.models.crm.lists.ListScheduleConversionParams
import com.hubspot_sdk.api.models.crm.lists.ListSearchResponse
import com.hubspot_sdk.api.models.crm.lists.ListSizeAndEditHistoryResponse
import com.hubspot_sdk.api.models.crm.lists.ListUpdateListFiltersParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateListNameParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateResponse
import com.hubspot_sdk.api.models.crm.lists.ListUpdateScheduleConversionParams
import com.hubspot_sdk.api.models.crm.lists.ListsByIdResponse
import com.hubspot_sdk.api.models.crm.lists.MembershipsUpdateResponse
import com.hubspot_sdk.api.models.crm.lists.PublicBatchMigrationMapping
import com.hubspot_sdk.api.models.crm.lists.PublicListConversionResponse
import com.hubspot_sdk.api.models.crm.lists.PublicMigrationMapping
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ListServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ListServiceAsync {

    private val withRawResponse: ListServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ListServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync =
        ListServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ListCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListCreateResponse> =
        // post /crm/lists/2026-03
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ListListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListsByIdResponse> =
        // get /crm/lists/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ListDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/lists/2026-03/{listId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun addAndRemoveMemberships(
        params: ListAddAndRemoveMembershipsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipsUpdateResponse> =
        // put /crm/lists/2026-03/{listId}/memberships/add-and-remove
        withRawResponse().addAndRemoveMemberships(params, requestOptions).thenApply { it.parse() }

    override fun addMemberships(
        params: ListAddMembershipsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipsUpdateResponse> =
        // put /crm/lists/2026-03/{listId}/memberships/add
        withRawResponse().addMemberships(params, requestOptions).thenApply { it.parse() }

    override fun addMembershipsFrom(
        params: ListAddMembershipsFromParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /crm/lists/2026-03/{listId}/memberships/add-from/{sourceListId}
        withRawResponse().addMembershipsFrom(params, requestOptions).thenAccept {}

    override fun batchReadMemberships(
        params: ListBatchReadMembershipsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseRecordIdWithMemberships> =
        // post /crm/lists/2026-03/records/memberships/batch/read
        withRawResponse().batchReadMemberships(params, requestOptions).thenApply { it.parse() }

    override fun createFolder(
        params: ListCreateFolderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderCreateResponse> =
        // post /crm/lists/2026-03/folders
        withRawResponse().createFolder(params, requestOptions).thenApply { it.parse() }

    override fun createIdMapping(
        params: ListCreateIdMappingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicBatchMigrationMapping> =
        // post /crm/lists/2026-03/idmapping
        withRawResponse().createIdMapping(params, requestOptions).thenApply { it.parse() }

    override fun deleteFolder(
        params: ListDeleteFolderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/lists/2026-03/folders/{folderId}
        withRawResponse().deleteFolder(params, requestOptions).thenAccept {}

    override fun deleteMemberships(
        params: ListDeleteMembershipsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/lists/2026-03/{listId}/memberships
        withRawResponse().deleteMemberships(params, requestOptions).thenAccept {}

    override fun get(
        params: ListGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFetchResponse> =
        // get /crm/lists/2026-03/{listId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getByObjectTypeAndName(
        params: ListGetByObjectTypeAndNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFetchResponse> =
        // get /crm/lists/2026-03/object-type-id/{objectTypeId}/name/{listName}
        withRawResponse().getByObjectTypeAndName(params, requestOptions).thenApply { it.parse() }

    override fun getIdMapping(
        params: ListGetIdMappingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicMigrationMapping> =
        // get /crm/lists/2026-03/idmapping
        withRawResponse().getIdMapping(params, requestOptions).thenApply { it.parse() }

    override fun getMembershipsJoinOrder(
        params: ListGetMembershipsJoinOrderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListGetMembershipsJoinOrderPageAsync> =
        // get /crm/lists/2026-03/{listId}/memberships/join-order
        withRawResponse().getMembershipsJoinOrder(params, requestOptions).thenApply { it.parse() }

    override fun getRecordMemberships(
        params: ListGetRecordMembershipsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiCollectionResponseRecordListMembership> =
        // get /crm/lists/2026-03/records/{objectTypeId}/{recordId}/memberships
        withRawResponse().getRecordMemberships(params, requestOptions).thenApply { it.parse() }

    override fun getScheduleConversion(
        params: ListGetScheduleConversionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicListConversionResponse> =
        // get /crm/lists/2026-03/{listId}/schedule-conversion
        withRawResponse().getScheduleConversion(params, requestOptions).thenApply { it.parse() }

    override fun getSizeAndEditsHistoryBetween(
        params: ListGetSizeAndEditsHistoryBetweenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListSizeAndEditHistoryResponse> =
        // get /crm/lists/2026-03/{listId}/size-and-edits-history/between
        withRawResponse().getSizeAndEditsHistoryBetween(params, requestOptions).thenApply {
            it.parse()
        }

    override fun listBySearch(
        params: ListListBySearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListSearchResponse> =
        // post /crm/lists/2026-03/search
        withRawResponse().listBySearch(params, requestOptions).thenApply { it.parse() }

    override fun listFolders(
        params: ListListFoldersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderFetchResponse> =
        // get /crm/lists/2026-03/folders
        withRawResponse().listFolders(params, requestOptions).thenApply { it.parse() }

    override fun listMemberships(
        params: ListListMembershipsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListListMembershipsPageAsync> =
        // get /crm/lists/2026-03/{listId}/memberships
        withRawResponse().listMemberships(params, requestOptions).thenApply { it.parse() }

    override fun moveFolder(
        params: ListMoveFolderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderFetchResponse> =
        // put /crm/lists/2026-03/folders/{folderId}/move/{newParentFolderId}
        withRawResponse().moveFolder(params, requestOptions).thenApply { it.parse() }

    override fun moveList(
        params: ListMoveListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /crm/lists/2026-03/folders/move-list
        withRawResponse().moveList(params, requestOptions).thenAccept {}

    override fun removeMemberships(
        params: ListRemoveMembershipsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipsUpdateResponse> =
        // put /crm/lists/2026-03/{listId}/memberships/remove
        withRawResponse().removeMemberships(params, requestOptions).thenApply { it.parse() }

    override fun renameFolder(
        params: ListRenameFolderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderFetchResponse> =
        // put /crm/lists/2026-03/folders/{folderId}/rename
        withRawResponse().renameFolder(params, requestOptions).thenApply { it.parse() }

    override fun restore(
        params: ListRestoreParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /crm/lists/2026-03/{listId}/restore
        withRawResponse().restore(params, requestOptions).thenAccept {}

    override fun scheduleConversion(
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/lists/2026-03/{listId}/schedule-conversion
        withRawResponse().scheduleConversion(params, requestOptions).thenAccept {}

    override fun updateListFilters(
        params: ListUpdateListFiltersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListUpdateResponse> =
        // put /crm/lists/2026-03/{listId}/update-list-filters
        withRawResponse().updateListFilters(params, requestOptions).thenApply { it.parse() }

    override fun updateListName(
        params: ListUpdateListNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListUpdateResponse> =
        // put /crm/lists/2026-03/{listId}/update-list-name
        withRawResponse().updateListName(params, requestOptions).thenApply { it.parse() }

    override fun updateScheduleConversion(
        params: ListUpdateScheduleConversionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicListConversionResponse> =
        // put /crm/lists/2026-03/{listId}/schedule-conversion
        withRawResponse().updateScheduleConversion(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListServiceAsync.WithRawResponse =
            ListServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ListCreateResponse> =
            jsonHandler<ListCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ListCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03")
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

        private val listHandler: Handler<ListsByIdResponse> =
            jsonHandler<ListsByIdResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ListListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListsByIdResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03")
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
            params: ListDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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

        private val addAndRemoveMembershipsHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun addAndRemoveMemberships(
            params: ListAddAndRemoveMembershipsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addAndRemoveMembershipsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addMembershipsHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun addMemberships(
            params: ListAddMembershipsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addMembershipsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addMembershipsFromHandler: Handler<Void?> = emptyHandler()

        override fun addMembershipsFrom(
            params: ListAddMembershipsFromParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { addMembershipsFromHandler.handle(it) }
                    }
                }
        }

        private val batchReadMembershipsHandler: Handler<BatchResponseRecordIdWithMemberships> =
            jsonHandler<BatchResponseRecordIdWithMemberships>(clientOptions.jsonMapper)

        override fun batchReadMemberships(
            params: ListBatchReadMembershipsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseRecordIdWithMemberships>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchReadMembershipsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createFolderHandler: Handler<ListFolderCreateResponse> =
            jsonHandler<ListFolderCreateResponse>(clientOptions.jsonMapper)

        override fun createFolder(
            params: ListCreateFolderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "folders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createFolderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createIdMappingHandler: Handler<PublicBatchMigrationMapping> =
            jsonHandler<PublicBatchMigrationMapping>(clientOptions.jsonMapper)

        override fun createIdMapping(
            params: ListCreateIdMappingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicBatchMigrationMapping>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "idmapping")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createIdMappingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteFolderHandler: Handler<Void?> = emptyHandler()

        override fun deleteFolder(
            params: ListDeleteFolderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteFolderHandler.handle(it) }
                    }
                }
        }

        private val deleteMembershipsHandler: Handler<Void?> = emptyHandler()

        override fun deleteMemberships(
            params: ListDeleteMembershipsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteMembershipsHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<ListFetchResponse> =
            jsonHandler<ListFetchResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ListGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", params._pathParam(0))
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

        private val getByObjectTypeAndNameHandler: Handler<ListFetchResponse> =
            jsonHandler<ListFetchResponse>(clientOptions.jsonMapper)

        override fun getByObjectTypeAndName(
            params: ListGetByObjectTypeAndNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByObjectTypeAndNameHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getIdMappingHandler: Handler<PublicMigrationMapping> =
            jsonHandler<PublicMigrationMapping>(clientOptions.jsonMapper)

        override fun getIdMapping(
            params: ListGetIdMappingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicMigrationMapping>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "idmapping")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getIdMappingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<ListGetMembershipsJoinOrderPageAsync>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getMembershipsJoinOrderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ListGetMembershipsJoinOrderPageAsync.builder()
                                    .service(ListServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getRecordMembershipsHandler:
            Handler<ApiCollectionResponseRecordListMembership> =
            jsonHandler<ApiCollectionResponseRecordListMembership>(clientOptions.jsonMapper)

        override fun getRecordMemberships(
            params: ListGetRecordMembershipsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembership>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRecordMembershipsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getScheduleConversionHandler: Handler<PublicListConversionResponse> =
            jsonHandler<PublicListConversionResponse>(clientOptions.jsonMapper)

        override fun getScheduleConversion(
            params: ListGetScheduleConversionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getScheduleConversionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSizeAndEditsHistoryBetweenHandler: Handler<ListSizeAndEditHistoryResponse> =
            jsonHandler<ListSizeAndEditHistoryResponse>(clientOptions.jsonMapper)

        override fun getSizeAndEditsHistoryBetween(
            params: ListGetSizeAndEditsHistoryBetweenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListSizeAndEditHistoryResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSizeAndEditsHistoryBetweenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listBySearchHandler: Handler<ListSearchResponse> =
            jsonHandler<ListSearchResponse>(clientOptions.jsonMapper)

        override fun listBySearch(
            params: ListListBySearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listBySearchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listFoldersHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun listFolders(
            params: ListListFoldersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "folders")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listFoldersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listMembershipsHandler: Handler<ApiCollectionResponseJoinTimeAndRecordId> =
            jsonHandler<ApiCollectionResponseJoinTimeAndRecordId>(clientOptions.jsonMapper)

        override fun listMemberships(
            params: ListListMembershipsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListListMembershipsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", params._pathParam(0), "memberships")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listMembershipsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ListListMembershipsPageAsync.builder()
                                    .service(ListServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val moveFolderHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun moveFolder(
            params: ListMoveFolderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { moveFolderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val moveListHandler: Handler<Void?> = emptyHandler()

        override fun moveList(
            params: ListMoveListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "lists", "2026-03", "folders", "move-list")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { moveListHandler.handle(it) }
                    }
                }
        }

        private val removeMembershipsHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun removeMemberships(
            params: ListRemoveMembershipsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { removeMembershipsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val renameFolderHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun renameFolder(
            params: ListRenameFolderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { renameFolderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val restoreHandler: Handler<Void?> = emptyHandler()

        override fun restore(
            params: ListRestoreParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { restoreHandler.handle(it) }
                    }
                }
        }

        private val scheduleConversionHandler: Handler<Void?> = emptyHandler()

        override fun scheduleConversion(
            params: ListScheduleConversionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { scheduleConversionHandler.handle(it) }
                    }
                }
        }

        private val updateListFiltersHandler: Handler<ListUpdateResponse> =
            jsonHandler<ListUpdateResponse>(clientOptions.jsonMapper)

        override fun updateListFilters(
            params: ListUpdateListFiltersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateListFiltersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateListNameHandler: Handler<ListUpdateResponse> =
            jsonHandler<ListUpdateResponse>(clientOptions.jsonMapper)

        override fun updateListName(
            params: ListUpdateListNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateListNameHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateScheduleConversionHandler: Handler<PublicListConversionResponse> =
            jsonHandler<PublicListConversionResponse>(clientOptions.jsonMapper)

        override fun updateScheduleConversion(
            params: ListUpdateScheduleConversionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
