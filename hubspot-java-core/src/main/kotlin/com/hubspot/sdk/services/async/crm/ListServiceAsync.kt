// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.lists.ApiCollectionResponseRecordListMembership
import com.hubspot.sdk.models.crm.lists.BatchInputRecordIdInput
import com.hubspot.sdk.models.crm.lists.BatchResponseRecordIdWithMemberships
import com.hubspot.sdk.models.crm.lists.ListAddAndRemoveMembershipsParams
import com.hubspot.sdk.models.crm.lists.ListAddMembershipsFromParams
import com.hubspot.sdk.models.crm.lists.ListAddMembershipsParams
import com.hubspot.sdk.models.crm.lists.ListBatchReadMembershipsParams
import com.hubspot.sdk.models.crm.lists.ListCreateFolderParams
import com.hubspot.sdk.models.crm.lists.ListCreateIdMappingParams
import com.hubspot.sdk.models.crm.lists.ListCreateParams
import com.hubspot.sdk.models.crm.lists.ListCreateRequest
import com.hubspot.sdk.models.crm.lists.ListCreateResponse
import com.hubspot.sdk.models.crm.lists.ListDeleteFolderParams
import com.hubspot.sdk.models.crm.lists.ListDeleteMembershipsParams
import com.hubspot.sdk.models.crm.lists.ListDeleteParams
import com.hubspot.sdk.models.crm.lists.ListFetchResponse
import com.hubspot.sdk.models.crm.lists.ListFolderCreateRequest
import com.hubspot.sdk.models.crm.lists.ListFolderCreateResponse
import com.hubspot.sdk.models.crm.lists.ListFolderFetchResponse
import com.hubspot.sdk.models.crm.lists.ListGetByObjectTypeAndNameParams
import com.hubspot.sdk.models.crm.lists.ListGetIdMappingParams
import com.hubspot.sdk.models.crm.lists.ListGetMembershipsJoinOrderPageAsync
import com.hubspot.sdk.models.crm.lists.ListGetMembershipsJoinOrderParams
import com.hubspot.sdk.models.crm.lists.ListGetParams
import com.hubspot.sdk.models.crm.lists.ListGetRecordMembershipsParams
import com.hubspot.sdk.models.crm.lists.ListGetScheduleConversionParams
import com.hubspot.sdk.models.crm.lists.ListGetSizeAndEditsHistoryBetweenParams
import com.hubspot.sdk.models.crm.lists.ListListBySearchParams
import com.hubspot.sdk.models.crm.lists.ListListFoldersParams
import com.hubspot.sdk.models.crm.lists.ListListMembershipsPageAsync
import com.hubspot.sdk.models.crm.lists.ListListMembershipsParams
import com.hubspot.sdk.models.crm.lists.ListListParams
import com.hubspot.sdk.models.crm.lists.ListMoveFolderParams
import com.hubspot.sdk.models.crm.lists.ListMoveListParams
import com.hubspot.sdk.models.crm.lists.ListMoveRequest
import com.hubspot.sdk.models.crm.lists.ListRemoveMembershipsParams
import com.hubspot.sdk.models.crm.lists.ListRenameFolderParams
import com.hubspot.sdk.models.crm.lists.ListRestoreParams
import com.hubspot.sdk.models.crm.lists.ListScheduleConversionParams
import com.hubspot.sdk.models.crm.lists.ListSearchRequest
import com.hubspot.sdk.models.crm.lists.ListSearchResponse
import com.hubspot.sdk.models.crm.lists.ListSizeAndEditHistoryResponse
import com.hubspot.sdk.models.crm.lists.ListUpdateListFiltersParams
import com.hubspot.sdk.models.crm.lists.ListUpdateListNameParams
import com.hubspot.sdk.models.crm.lists.ListUpdateResponse
import com.hubspot.sdk.models.crm.lists.ListUpdateScheduleConversionParams
import com.hubspot.sdk.models.crm.lists.ListsByIdResponse
import com.hubspot.sdk.models.crm.lists.MembershipsUpdateResponse
import com.hubspot.sdk.models.crm.lists.PublicBatchMigrationMapping
import com.hubspot.sdk.models.crm.lists.PublicListConversionResponse
import com.hubspot.sdk.models.crm.lists.PublicMigrationMapping
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ListServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync

    fun create(params: ListCreateParams): CompletableFuture<ListCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ListCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListCreateResponse>

    /** @see create */
    fun create(
        listCreateRequest: ListCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListCreateResponse> =
        create(
            ListCreateParams.builder().listCreateRequest(listCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(listCreateRequest: ListCreateRequest): CompletableFuture<ListCreateResponse> =
        create(listCreateRequest, RequestOptions.none())

    fun list(): CompletableFuture<ListsByIdResponse> = list(ListListParams.none())

    /** @see list */
    fun list(
        params: ListListParams = ListListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListsByIdResponse>

    /** @see list */
    fun list(params: ListListParams = ListListParams.none()): CompletableFuture<ListsByIdResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ListsByIdResponse> =
        list(ListListParams.none(), requestOptions)

    fun delete(listId: String): CompletableFuture<Void?> = delete(listId, ListDeleteParams.none())

    /** @see delete */
    fun delete(
        listId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see delete */
    fun delete(
        listId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(listId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ListDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ListDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(listId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(listId, ListDeleteParams.none(), requestOptions)

    fun addAndRemoveMemberships(
        listId: String,
        params: ListAddAndRemoveMembershipsParams,
    ): CompletableFuture<MembershipsUpdateResponse> =
        addAndRemoveMemberships(listId, params, RequestOptions.none())

    /** @see addAndRemoveMemberships */
    fun addAndRemoveMemberships(
        listId: String,
        params: ListAddAndRemoveMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse> =
        addAndRemoveMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see addAndRemoveMemberships */
    fun addAndRemoveMemberships(
        params: ListAddAndRemoveMembershipsParams
    ): CompletableFuture<MembershipsUpdateResponse> =
        addAndRemoveMemberships(params, RequestOptions.none())

    /** @see addAndRemoveMemberships */
    fun addAndRemoveMemberships(
        params: ListAddAndRemoveMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse>

    fun addMemberships(
        listId: String,
        params: ListAddMembershipsParams,
    ): CompletableFuture<MembershipsUpdateResponse> =
        addMemberships(listId, params, RequestOptions.none())

    /** @see addMemberships */
    fun addMemberships(
        listId: String,
        params: ListAddMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse> =
        addMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see addMemberships */
    fun addMemberships(
        params: ListAddMembershipsParams
    ): CompletableFuture<MembershipsUpdateResponse> = addMemberships(params, RequestOptions.none())

    /** @see addMemberships */
    fun addMemberships(
        params: ListAddMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse>

    fun addMembershipsFrom(
        sourceListId: String,
        params: ListAddMembershipsFromParams,
    ): CompletableFuture<Void?> = addMembershipsFrom(sourceListId, params, RequestOptions.none())

    /** @see addMembershipsFrom */
    fun addMembershipsFrom(
        sourceListId: String,
        params: ListAddMembershipsFromParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        addMembershipsFrom(params.toBuilder().sourceListId(sourceListId).build(), requestOptions)

    /** @see addMembershipsFrom */
    fun addMembershipsFrom(params: ListAddMembershipsFromParams): CompletableFuture<Void?> =
        addMembershipsFrom(params, RequestOptions.none())

    /** @see addMembershipsFrom */
    fun addMembershipsFrom(
        params: ListAddMembershipsFromParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun batchReadMemberships(
        params: ListBatchReadMembershipsParams
    ): CompletableFuture<BatchResponseRecordIdWithMemberships> =
        batchReadMemberships(params, RequestOptions.none())

    /** @see batchReadMemberships */
    fun batchReadMemberships(
        params: ListBatchReadMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseRecordIdWithMemberships>

    /** @see batchReadMemberships */
    fun batchReadMemberships(
        batchInputRecordIdInput: BatchInputRecordIdInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseRecordIdWithMemberships> =
        batchReadMemberships(
            ListBatchReadMembershipsParams.builder()
                .batchInputRecordIdInput(batchInputRecordIdInput)
                .build(),
            requestOptions,
        )

    /** @see batchReadMemberships */
    fun batchReadMemberships(
        batchInputRecordIdInput: BatchInputRecordIdInput
    ): CompletableFuture<BatchResponseRecordIdWithMemberships> =
        batchReadMemberships(batchInputRecordIdInput, RequestOptions.none())

    fun createFolder(params: ListCreateFolderParams): CompletableFuture<ListFolderCreateResponse> =
        createFolder(params, RequestOptions.none())

    /** @see createFolder */
    fun createFolder(
        params: ListCreateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderCreateResponse>

    /** @see createFolder */
    fun createFolder(
        listFolderCreateRequest: ListFolderCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderCreateResponse> =
        createFolder(
            ListCreateFolderParams.builder()
                .listFolderCreateRequest(listFolderCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createFolder */
    fun createFolder(
        listFolderCreateRequest: ListFolderCreateRequest
    ): CompletableFuture<ListFolderCreateResponse> =
        createFolder(listFolderCreateRequest, RequestOptions.none())

    fun createIdMapping(
        params: ListCreateIdMappingParams
    ): CompletableFuture<PublicBatchMigrationMapping> =
        createIdMapping(params, RequestOptions.none())

    /** @see createIdMapping */
    fun createIdMapping(
        params: ListCreateIdMappingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBatchMigrationMapping>

    /** @see createIdMapping */
    fun createIdMapping(
        body: List<String>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicBatchMigrationMapping> =
        createIdMapping(ListCreateIdMappingParams.builder().body(body).build(), requestOptions)

    /** @see createIdMapping */
    fun createIdMapping(body: List<String>): CompletableFuture<PublicBatchMigrationMapping> =
        createIdMapping(body, RequestOptions.none())

    fun deleteFolder(folderId: String): CompletableFuture<Void?> =
        deleteFolder(folderId, ListDeleteFolderParams.none())

    /** @see deleteFolder */
    fun deleteFolder(
        folderId: String,
        params: ListDeleteFolderParams = ListDeleteFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteFolder(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see deleteFolder */
    fun deleteFolder(
        folderId: String,
        params: ListDeleteFolderParams = ListDeleteFolderParams.none(),
    ): CompletableFuture<Void?> = deleteFolder(folderId, params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(
        params: ListDeleteFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteFolder */
    fun deleteFolder(params: ListDeleteFolderParams): CompletableFuture<Void?> =
        deleteFolder(params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(folderId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteFolder(folderId, ListDeleteFolderParams.none(), requestOptions)

    fun deleteMemberships(listId: String): CompletableFuture<Void?> =
        deleteMemberships(listId, ListDeleteMembershipsParams.none())

    /** @see deleteMemberships */
    fun deleteMemberships(
        listId: String,
        params: ListDeleteMembershipsParams = ListDeleteMembershipsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see deleteMemberships */
    fun deleteMemberships(
        listId: String,
        params: ListDeleteMembershipsParams = ListDeleteMembershipsParams.none(),
    ): CompletableFuture<Void?> = deleteMemberships(listId, params, RequestOptions.none())

    /** @see deleteMemberships */
    fun deleteMemberships(
        params: ListDeleteMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteMemberships */
    fun deleteMemberships(params: ListDeleteMembershipsParams): CompletableFuture<Void?> =
        deleteMemberships(params, RequestOptions.none())

    /** @see deleteMemberships */
    fun deleteMemberships(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteMemberships(listId, ListDeleteMembershipsParams.none(), requestOptions)

    fun get(listId: String): CompletableFuture<ListFetchResponse> =
        get(listId, ListGetParams.none())

    /** @see get */
    fun get(
        listId: String,
        params: ListGetParams = ListGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFetchResponse> =
        get(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see get */
    fun get(
        listId: String,
        params: ListGetParams = ListGetParams.none(),
    ): CompletableFuture<ListFetchResponse> = get(listId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ListGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFetchResponse>

    /** @see get */
    fun get(params: ListGetParams): CompletableFuture<ListFetchResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(listId: String, requestOptions: RequestOptions): CompletableFuture<ListFetchResponse> =
        get(listId, ListGetParams.none(), requestOptions)

    fun getByObjectTypeAndName(
        listName: String,
        params: ListGetByObjectTypeAndNameParams,
    ): CompletableFuture<ListFetchResponse> =
        getByObjectTypeAndName(listName, params, RequestOptions.none())

    /** @see getByObjectTypeAndName */
    fun getByObjectTypeAndName(
        listName: String,
        params: ListGetByObjectTypeAndNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFetchResponse> =
        getByObjectTypeAndName(params.toBuilder().listName(listName).build(), requestOptions)

    /** @see getByObjectTypeAndName */
    fun getByObjectTypeAndName(
        params: ListGetByObjectTypeAndNameParams
    ): CompletableFuture<ListFetchResponse> = getByObjectTypeAndName(params, RequestOptions.none())

    /** @see getByObjectTypeAndName */
    fun getByObjectTypeAndName(
        params: ListGetByObjectTypeAndNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFetchResponse>

    fun getIdMapping(): CompletableFuture<PublicMigrationMapping> =
        getIdMapping(ListGetIdMappingParams.none())

    /** @see getIdMapping */
    fun getIdMapping(
        params: ListGetIdMappingParams = ListGetIdMappingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicMigrationMapping>

    /** @see getIdMapping */
    fun getIdMapping(
        params: ListGetIdMappingParams = ListGetIdMappingParams.none()
    ): CompletableFuture<PublicMigrationMapping> = getIdMapping(params, RequestOptions.none())

    /** @see getIdMapping */
    fun getIdMapping(requestOptions: RequestOptions): CompletableFuture<PublicMigrationMapping> =
        getIdMapping(ListGetIdMappingParams.none(), requestOptions)

    fun getMembershipsJoinOrder(
        listId: String
    ): CompletableFuture<ListGetMembershipsJoinOrderPageAsync> =
        getMembershipsJoinOrder(listId, ListGetMembershipsJoinOrderParams.none())

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        listId: String,
        params: ListGetMembershipsJoinOrderParams = ListGetMembershipsJoinOrderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListGetMembershipsJoinOrderPageAsync> =
        getMembershipsJoinOrder(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        listId: String,
        params: ListGetMembershipsJoinOrderParams = ListGetMembershipsJoinOrderParams.none(),
    ): CompletableFuture<ListGetMembershipsJoinOrderPageAsync> =
        getMembershipsJoinOrder(listId, params, RequestOptions.none())

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        params: ListGetMembershipsJoinOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListGetMembershipsJoinOrderPageAsync>

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        params: ListGetMembershipsJoinOrderParams
    ): CompletableFuture<ListGetMembershipsJoinOrderPageAsync> =
        getMembershipsJoinOrder(params, RequestOptions.none())

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListGetMembershipsJoinOrderPageAsync> =
        getMembershipsJoinOrder(listId, ListGetMembershipsJoinOrderParams.none(), requestOptions)

    fun getRecordMemberships(
        recordId: String,
        params: ListGetRecordMembershipsParams,
    ): CompletableFuture<ApiCollectionResponseRecordListMembership> =
        getRecordMemberships(recordId, params, RequestOptions.none())

    /** @see getRecordMemberships */
    fun getRecordMemberships(
        recordId: String,
        params: ListGetRecordMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiCollectionResponseRecordListMembership> =
        getRecordMemberships(params.toBuilder().recordId(recordId).build(), requestOptions)

    /** @see getRecordMemberships */
    fun getRecordMemberships(
        params: ListGetRecordMembershipsParams
    ): CompletableFuture<ApiCollectionResponseRecordListMembership> =
        getRecordMemberships(params, RequestOptions.none())

    /** @see getRecordMemberships */
    fun getRecordMemberships(
        params: ListGetRecordMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiCollectionResponseRecordListMembership>

    fun getScheduleConversion(listId: String): CompletableFuture<PublicListConversionResponse> =
        getScheduleConversion(listId, ListGetScheduleConversionParams.none())

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        listId: String,
        params: ListGetScheduleConversionParams = ListGetScheduleConversionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicListConversionResponse> =
        getScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        listId: String,
        params: ListGetScheduleConversionParams = ListGetScheduleConversionParams.none(),
    ): CompletableFuture<PublicListConversionResponse> =
        getScheduleConversion(listId, params, RequestOptions.none())

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        params: ListGetScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicListConversionResponse>

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        params: ListGetScheduleConversionParams
    ): CompletableFuture<PublicListConversionResponse> =
        getScheduleConversion(params, RequestOptions.none())

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicListConversionResponse> =
        getScheduleConversion(listId, ListGetScheduleConversionParams.none(), requestOptions)

    fun getSizeAndEditsHistoryBetween(
        listId: String
    ): CompletableFuture<ListSizeAndEditHistoryResponse> =
        getSizeAndEditsHistoryBetween(listId, ListGetSizeAndEditsHistoryBetweenParams.none())

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        listId: String,
        params: ListGetSizeAndEditsHistoryBetweenParams =
            ListGetSizeAndEditsHistoryBetweenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListSizeAndEditHistoryResponse> =
        getSizeAndEditsHistoryBetween(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        listId: String,
        params: ListGetSizeAndEditsHistoryBetweenParams =
            ListGetSizeAndEditsHistoryBetweenParams.none(),
    ): CompletableFuture<ListSizeAndEditHistoryResponse> =
        getSizeAndEditsHistoryBetween(listId, params, RequestOptions.none())

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        params: ListGetSizeAndEditsHistoryBetweenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListSizeAndEditHistoryResponse>

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        params: ListGetSizeAndEditsHistoryBetweenParams
    ): CompletableFuture<ListSizeAndEditHistoryResponse> =
        getSizeAndEditsHistoryBetween(params, RequestOptions.none())

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListSizeAndEditHistoryResponse> =
        getSizeAndEditsHistoryBetween(
            listId,
            ListGetSizeAndEditsHistoryBetweenParams.none(),
            requestOptions,
        )

    fun listBySearch(params: ListListBySearchParams): CompletableFuture<ListSearchResponse> =
        listBySearch(params, RequestOptions.none())

    /** @see listBySearch */
    fun listBySearch(
        params: ListListBySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListSearchResponse>

    /** @see listBySearch */
    fun listBySearch(
        listSearchRequest: ListSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListSearchResponse> =
        listBySearch(
            ListListBySearchParams.builder().listSearchRequest(listSearchRequest).build(),
            requestOptions,
        )

    /** @see listBySearch */
    fun listBySearch(listSearchRequest: ListSearchRequest): CompletableFuture<ListSearchResponse> =
        listBySearch(listSearchRequest, RequestOptions.none())

    fun listFolders(): CompletableFuture<ListFolderFetchResponse> =
        listFolders(ListListFoldersParams.none())

    /** @see listFolders */
    fun listFolders(
        params: ListListFoldersParams = ListListFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse>

    /** @see listFolders */
    fun listFolders(
        params: ListListFoldersParams = ListListFoldersParams.none()
    ): CompletableFuture<ListFolderFetchResponse> = listFolders(params, RequestOptions.none())

    /** @see listFolders */
    fun listFolders(requestOptions: RequestOptions): CompletableFuture<ListFolderFetchResponse> =
        listFolders(ListListFoldersParams.none(), requestOptions)

    fun listMemberships(listId: String): CompletableFuture<ListListMembershipsPageAsync> =
        listMemberships(listId, ListListMembershipsParams.none())

    /** @see listMemberships */
    fun listMemberships(
        listId: String,
        params: ListListMembershipsParams = ListListMembershipsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListListMembershipsPageAsync> =
        listMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see listMemberships */
    fun listMemberships(
        listId: String,
        params: ListListMembershipsParams = ListListMembershipsParams.none(),
    ): CompletableFuture<ListListMembershipsPageAsync> =
        listMemberships(listId, params, RequestOptions.none())

    /** @see listMemberships */
    fun listMemberships(
        params: ListListMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListListMembershipsPageAsync>

    /** @see listMemberships */
    fun listMemberships(
        params: ListListMembershipsParams
    ): CompletableFuture<ListListMembershipsPageAsync> =
        listMemberships(params, RequestOptions.none())

    /** @see listMemberships */
    fun listMemberships(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListListMembershipsPageAsync> =
        listMemberships(listId, ListListMembershipsParams.none(), requestOptions)

    fun moveFolder(
        newParentFolderId: String,
        params: ListMoveFolderParams,
    ): CompletableFuture<ListFolderFetchResponse> =
        moveFolder(newParentFolderId, params, RequestOptions.none())

    /** @see moveFolder */
    fun moveFolder(
        newParentFolderId: String,
        params: ListMoveFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse> =
        moveFolder(params.toBuilder().newParentFolderId(newParentFolderId).build(), requestOptions)

    /** @see moveFolder */
    fun moveFolder(params: ListMoveFolderParams): CompletableFuture<ListFolderFetchResponse> =
        moveFolder(params, RequestOptions.none())

    /** @see moveFolder */
    fun moveFolder(
        params: ListMoveFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse>

    fun moveList(params: ListMoveListParams): CompletableFuture<Void?> =
        moveList(params, RequestOptions.none())

    /** @see moveList */
    fun moveList(
        params: ListMoveListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see moveList */
    fun moveList(
        listMoveRequest: ListMoveRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        moveList(
            ListMoveListParams.builder().listMoveRequest(listMoveRequest).build(),
            requestOptions,
        )

    /** @see moveList */
    fun moveList(listMoveRequest: ListMoveRequest): CompletableFuture<Void?> =
        moveList(listMoveRequest, RequestOptions.none())

    fun removeMemberships(
        listId: String,
        params: ListRemoveMembershipsParams,
    ): CompletableFuture<MembershipsUpdateResponse> =
        removeMemberships(listId, params, RequestOptions.none())

    /** @see removeMemberships */
    fun removeMemberships(
        listId: String,
        params: ListRemoveMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse> =
        removeMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see removeMemberships */
    fun removeMemberships(
        params: ListRemoveMembershipsParams
    ): CompletableFuture<MembershipsUpdateResponse> =
        removeMemberships(params, RequestOptions.none())

    /** @see removeMemberships */
    fun removeMemberships(
        params: ListRemoveMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse>

    fun renameFolder(folderId: String): CompletableFuture<ListFolderFetchResponse> =
        renameFolder(folderId, ListRenameFolderParams.none())

    /** @see renameFolder */
    fun renameFolder(
        folderId: String,
        params: ListRenameFolderParams = ListRenameFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse> =
        renameFolder(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see renameFolder */
    fun renameFolder(
        folderId: String,
        params: ListRenameFolderParams = ListRenameFolderParams.none(),
    ): CompletableFuture<ListFolderFetchResponse> =
        renameFolder(folderId, params, RequestOptions.none())

    /** @see renameFolder */
    fun renameFolder(
        params: ListRenameFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse>

    /** @see renameFolder */
    fun renameFolder(params: ListRenameFolderParams): CompletableFuture<ListFolderFetchResponse> =
        renameFolder(params, RequestOptions.none())

    /** @see renameFolder */
    fun renameFolder(
        folderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderFetchResponse> =
        renameFolder(folderId, ListRenameFolderParams.none(), requestOptions)

    fun restore(listId: String): CompletableFuture<Void?> =
        restore(listId, ListRestoreParams.none())

    /** @see restore */
    fun restore(
        listId: String,
        params: ListRestoreParams = ListRestoreParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = restore(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see restore */
    fun restore(
        listId: String,
        params: ListRestoreParams = ListRestoreParams.none(),
    ): CompletableFuture<Void?> = restore(listId, params, RequestOptions.none())

    /** @see restore */
    fun restore(
        params: ListRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see restore */
    fun restore(params: ListRestoreParams): CompletableFuture<Void?> =
        restore(params, RequestOptions.none())

    /** @see restore */
    fun restore(listId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        restore(listId, ListRestoreParams.none(), requestOptions)

    fun scheduleConversion(listId: String): CompletableFuture<Void?> =
        scheduleConversion(listId, ListScheduleConversionParams.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        listId: String,
        params: ListScheduleConversionParams = ListScheduleConversionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        scheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see scheduleConversion */
    fun scheduleConversion(
        listId: String,
        params: ListScheduleConversionParams = ListScheduleConversionParams.none(),
    ): CompletableFuture<Void?> = scheduleConversion(listId, params, RequestOptions.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see scheduleConversion */
    fun scheduleConversion(params: ListScheduleConversionParams): CompletableFuture<Void?> =
        scheduleConversion(params, RequestOptions.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        scheduleConversion(listId, ListScheduleConversionParams.none(), requestOptions)

    fun updateListFilters(
        listId: String,
        params: ListUpdateListFiltersParams,
    ): CompletableFuture<ListUpdateResponse> =
        updateListFilters(listId, params, RequestOptions.none())

    /** @see updateListFilters */
    fun updateListFilters(
        listId: String,
        params: ListUpdateListFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListUpdateResponse> =
        updateListFilters(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateListFilters */
    fun updateListFilters(
        params: ListUpdateListFiltersParams
    ): CompletableFuture<ListUpdateResponse> = updateListFilters(params, RequestOptions.none())

    /** @see updateListFilters */
    fun updateListFilters(
        params: ListUpdateListFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListUpdateResponse>

    fun updateListName(listId: String): CompletableFuture<ListUpdateResponse> =
        updateListName(listId, ListUpdateListNameParams.none())

    /** @see updateListName */
    fun updateListName(
        listId: String,
        params: ListUpdateListNameParams = ListUpdateListNameParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListUpdateResponse> =
        updateListName(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateListName */
    fun updateListName(
        listId: String,
        params: ListUpdateListNameParams = ListUpdateListNameParams.none(),
    ): CompletableFuture<ListUpdateResponse> = updateListName(listId, params, RequestOptions.none())

    /** @see updateListName */
    fun updateListName(
        params: ListUpdateListNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListUpdateResponse>

    /** @see updateListName */
    fun updateListName(params: ListUpdateListNameParams): CompletableFuture<ListUpdateResponse> =
        updateListName(params, RequestOptions.none())

    /** @see updateListName */
    fun updateListName(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListUpdateResponse> =
        updateListName(listId, ListUpdateListNameParams.none(), requestOptions)

    fun updateScheduleConversion(
        listId: String,
        params: ListUpdateScheduleConversionParams,
    ): CompletableFuture<PublicListConversionResponse> =
        updateScheduleConversion(listId, params, RequestOptions.none())

    /** @see updateScheduleConversion */
    fun updateScheduleConversion(
        listId: String,
        params: ListUpdateScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicListConversionResponse> =
        updateScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateScheduleConversion */
    fun updateScheduleConversion(
        params: ListUpdateScheduleConversionParams
    ): CompletableFuture<PublicListConversionResponse> =
        updateScheduleConversion(params, RequestOptions.none())

    /** @see updateScheduleConversion */
    fun updateScheduleConversion(
        params: ListUpdateScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicListConversionResponse>

    /** A view of [ListServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03`, but is otherwise the same as
         * [ListServiceAsync.create].
         */
        fun create(
            params: ListCreateParams
        ): CompletableFuture<HttpResponseFor<ListCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ListCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListCreateResponse>>

        /** @see create */
        fun create(
            listCreateRequest: ListCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListCreateResponse>> =
            create(
                ListCreateParams.builder().listCreateRequest(listCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            listCreateRequest: ListCreateRequest
        ): CompletableFuture<HttpResponseFor<ListCreateResponse>> =
            create(listCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03`, but is otherwise the same as
         * [ListServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ListsByIdResponse>> =
            list(ListListParams.none())

        /** @see list */
        fun list(
            params: ListListParams = ListListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListsByIdResponse>>

        /** @see list */
        fun list(
            params: ListListParams = ListListParams.none()
        ): CompletableFuture<HttpResponseFor<ListsByIdResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ListsByIdResponse>> =
            list(ListListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/lists/2026-03/{listId}`, but is otherwise
         * the same as [ListServiceAsync.delete].
         */
        fun delete(listId: String): CompletableFuture<HttpResponse> =
            delete(listId, ListDeleteParams.none())

        /** @see delete */
        fun delete(
            listId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see delete */
        fun delete(
            listId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(listId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ListDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(listId, ListDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /crm/lists/2026-03/{listId}/memberships/add-and-remove`, but is otherwise the same as
         * [ListServiceAsync.addAndRemoveMemberships].
         */
        fun addAndRemoveMemberships(
            listId: String,
            params: ListAddAndRemoveMembershipsParams,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addAndRemoveMemberships(listId, params, RequestOptions.none())

        /** @see addAndRemoveMemberships */
        fun addAndRemoveMemberships(
            listId: String,
            params: ListAddAndRemoveMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addAndRemoveMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see addAndRemoveMemberships */
        fun addAndRemoveMemberships(
            params: ListAddAndRemoveMembershipsParams
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addAndRemoveMemberships(params, RequestOptions.none())

        /** @see addAndRemoveMemberships */
        fun addAndRemoveMemberships(
            params: ListAddAndRemoveMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>>

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/memberships/add`, but is
         * otherwise the same as [ListServiceAsync.addMemberships].
         */
        fun addMemberships(
            listId: String,
            params: ListAddMembershipsParams,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addMemberships(listId, params, RequestOptions.none())

        /** @see addMemberships */
        fun addMemberships(
            listId: String,
            params: ListAddMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see addMemberships */
        fun addMemberships(
            params: ListAddMembershipsParams
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addMemberships(params, RequestOptions.none())

        /** @see addMemberships */
        fun addMemberships(
            params: ListAddMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/lists/2026-03/{listId}/memberships/add-from/{sourceListId}`, but is otherwise the
         * same as [ListServiceAsync.addMembershipsFrom].
         */
        fun addMembershipsFrom(
            sourceListId: String,
            params: ListAddMembershipsFromParams,
        ): CompletableFuture<HttpResponse> =
            addMembershipsFrom(sourceListId, params, RequestOptions.none())

        /** @see addMembershipsFrom */
        fun addMembershipsFrom(
            sourceListId: String,
            params: ListAddMembershipsFromParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addMembershipsFrom(
                params.toBuilder().sourceListId(sourceListId).build(),
                requestOptions,
            )

        /** @see addMembershipsFrom */
        fun addMembershipsFrom(
            params: ListAddMembershipsFromParams
        ): CompletableFuture<HttpResponse> = addMembershipsFrom(params, RequestOptions.none())

        /** @see addMembershipsFrom */
        fun addMembershipsFrom(
            params: ListAddMembershipsFromParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03/records/memberships/batch/read`,
         * but is otherwise the same as [ListServiceAsync.batchReadMemberships].
         */
        fun batchReadMemberships(
            params: ListBatchReadMembershipsParams
        ): CompletableFuture<HttpResponseFor<BatchResponseRecordIdWithMemberships>> =
            batchReadMemberships(params, RequestOptions.none())

        /** @see batchReadMemberships */
        fun batchReadMemberships(
            params: ListBatchReadMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseRecordIdWithMemberships>>

        /** @see batchReadMemberships */
        fun batchReadMemberships(
            batchInputRecordIdInput: BatchInputRecordIdInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseRecordIdWithMemberships>> =
            batchReadMemberships(
                ListBatchReadMembershipsParams.builder()
                    .batchInputRecordIdInput(batchInputRecordIdInput)
                    .build(),
                requestOptions,
            )

        /** @see batchReadMemberships */
        fun batchReadMemberships(
            batchInputRecordIdInput: BatchInputRecordIdInput
        ): CompletableFuture<HttpResponseFor<BatchResponseRecordIdWithMemberships>> =
            batchReadMemberships(batchInputRecordIdInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03/folders`, but is otherwise the
         * same as [ListServiceAsync.createFolder].
         */
        fun createFolder(
            params: ListCreateFolderParams
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>> =
            createFolder(params, RequestOptions.none())

        /** @see createFolder */
        fun createFolder(
            params: ListCreateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>>

        /** @see createFolder */
        fun createFolder(
            listFolderCreateRequest: ListFolderCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>> =
            createFolder(
                ListCreateFolderParams.builder()
                    .listFolderCreateRequest(listFolderCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createFolder */
        fun createFolder(
            listFolderCreateRequest: ListFolderCreateRequest
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>> =
            createFolder(listFolderCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03/idmapping`, but is otherwise the
         * same as [ListServiceAsync.createIdMapping].
         */
        fun createIdMapping(
            params: ListCreateIdMappingParams
        ): CompletableFuture<HttpResponseFor<PublicBatchMigrationMapping>> =
            createIdMapping(params, RequestOptions.none())

        /** @see createIdMapping */
        fun createIdMapping(
            params: ListCreateIdMappingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBatchMigrationMapping>>

        /** @see createIdMapping */
        fun createIdMapping(
            body: List<String>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicBatchMigrationMapping>> =
            createIdMapping(ListCreateIdMappingParams.builder().body(body).build(), requestOptions)

        /** @see createIdMapping */
        fun createIdMapping(
            body: List<String>
        ): CompletableFuture<HttpResponseFor<PublicBatchMigrationMapping>> =
            createIdMapping(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /crm/lists/2026-03/folders/{folderId}`, but is
         * otherwise the same as [ListServiceAsync.deleteFolder].
         */
        fun deleteFolder(folderId: String): CompletableFuture<HttpResponse> =
            deleteFolder(folderId, ListDeleteFolderParams.none())

        /** @see deleteFolder */
        fun deleteFolder(
            folderId: String,
            params: ListDeleteFolderParams = ListDeleteFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteFolder(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see deleteFolder */
        fun deleteFolder(
            folderId: String,
            params: ListDeleteFolderParams = ListDeleteFolderParams.none(),
        ): CompletableFuture<HttpResponse> = deleteFolder(folderId, params, RequestOptions.none())

        /** @see deleteFolder */
        fun deleteFolder(
            params: ListDeleteFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteFolder */
        fun deleteFolder(params: ListDeleteFolderParams): CompletableFuture<HttpResponse> =
            deleteFolder(params, RequestOptions.none())

        /** @see deleteFolder */
        fun deleteFolder(
            folderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteFolder(folderId, ListDeleteFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/lists/2026-03/{listId}/memberships`, but is
         * otherwise the same as [ListServiceAsync.deleteMemberships].
         */
        fun deleteMemberships(listId: String): CompletableFuture<HttpResponse> =
            deleteMemberships(listId, ListDeleteMembershipsParams.none())

        /** @see deleteMemberships */
        fun deleteMemberships(
            listId: String,
            params: ListDeleteMembershipsParams = ListDeleteMembershipsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see deleteMemberships */
        fun deleteMemberships(
            listId: String,
            params: ListDeleteMembershipsParams = ListDeleteMembershipsParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteMemberships(listId, params, RequestOptions.none())

        /** @see deleteMemberships */
        fun deleteMemberships(
            params: ListDeleteMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteMemberships */
        fun deleteMemberships(
            params: ListDeleteMembershipsParams
        ): CompletableFuture<HttpResponse> = deleteMemberships(params, RequestOptions.none())

        /** @see deleteMemberships */
        fun deleteMemberships(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteMemberships(listId, ListDeleteMembershipsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/{listId}`, but is otherwise the
         * same as [ListServiceAsync.get].
         */
        fun get(listId: String): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            get(listId, ListGetParams.none())

        /** @see get */
        fun get(
            listId: String,
            params: ListGetParams = ListGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            get(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see get */
        fun get(
            listId: String,
            params: ListGetParams = ListGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            get(listId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ListGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>>

        /** @see get */
        fun get(params: ListGetParams): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            get(listId, ListGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/lists/2026-03/object-type-id/{objectTypeId}/name/{listName}`, but is otherwise the
         * same as [ListServiceAsync.getByObjectTypeAndName].
         */
        fun getByObjectTypeAndName(
            listName: String,
            params: ListGetByObjectTypeAndNameParams,
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            getByObjectTypeAndName(listName, params, RequestOptions.none())

        /** @see getByObjectTypeAndName */
        fun getByObjectTypeAndName(
            listName: String,
            params: ListGetByObjectTypeAndNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            getByObjectTypeAndName(params.toBuilder().listName(listName).build(), requestOptions)

        /** @see getByObjectTypeAndName */
        fun getByObjectTypeAndName(
            params: ListGetByObjectTypeAndNameParams
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            getByObjectTypeAndName(params, RequestOptions.none())

        /** @see getByObjectTypeAndName */
        fun getByObjectTypeAndName(
            params: ListGetByObjectTypeAndNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>>

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/idmapping`, but is otherwise the
         * same as [ListServiceAsync.getIdMapping].
         */
        fun getIdMapping(): CompletableFuture<HttpResponseFor<PublicMigrationMapping>> =
            getIdMapping(ListGetIdMappingParams.none())

        /** @see getIdMapping */
        fun getIdMapping(
            params: ListGetIdMappingParams = ListGetIdMappingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicMigrationMapping>>

        /** @see getIdMapping */
        fun getIdMapping(
            params: ListGetIdMappingParams = ListGetIdMappingParams.none()
        ): CompletableFuture<HttpResponseFor<PublicMigrationMapping>> =
            getIdMapping(params, RequestOptions.none())

        /** @see getIdMapping */
        fun getIdMapping(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PublicMigrationMapping>> =
            getIdMapping(ListGetIdMappingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/{listId}/memberships/join-order`,
         * but is otherwise the same as [ListServiceAsync.getMembershipsJoinOrder].
         */
        fun getMembershipsJoinOrder(
            listId: String
        ): CompletableFuture<HttpResponseFor<ListGetMembershipsJoinOrderPageAsync>> =
            getMembershipsJoinOrder(listId, ListGetMembershipsJoinOrderParams.none())

        /** @see getMembershipsJoinOrder */
        fun getMembershipsJoinOrder(
            listId: String,
            params: ListGetMembershipsJoinOrderParams = ListGetMembershipsJoinOrderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListGetMembershipsJoinOrderPageAsync>> =
            getMembershipsJoinOrder(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see getMembershipsJoinOrder */
        fun getMembershipsJoinOrder(
            listId: String,
            params: ListGetMembershipsJoinOrderParams = ListGetMembershipsJoinOrderParams.none(),
        ): CompletableFuture<HttpResponseFor<ListGetMembershipsJoinOrderPageAsync>> =
            getMembershipsJoinOrder(listId, params, RequestOptions.none())

        /** @see getMembershipsJoinOrder */
        fun getMembershipsJoinOrder(
            params: ListGetMembershipsJoinOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListGetMembershipsJoinOrderPageAsync>>

        /** @see getMembershipsJoinOrder */
        fun getMembershipsJoinOrder(
            params: ListGetMembershipsJoinOrderParams
        ): CompletableFuture<HttpResponseFor<ListGetMembershipsJoinOrderPageAsync>> =
            getMembershipsJoinOrder(params, RequestOptions.none())

        /** @see getMembershipsJoinOrder */
        fun getMembershipsJoinOrder(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListGetMembershipsJoinOrderPageAsync>> =
            getMembershipsJoinOrder(
                listId,
                ListGetMembershipsJoinOrderParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /crm/lists/2026-03/records/{objectTypeId}/{recordId}/memberships`, but is otherwise the
         * same as [ListServiceAsync.getRecordMemberships].
         */
        fun getRecordMemberships(
            recordId: String,
            params: ListGetRecordMembershipsParams,
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembership>> =
            getRecordMemberships(recordId, params, RequestOptions.none())

        /** @see getRecordMemberships */
        fun getRecordMemberships(
            recordId: String,
            params: ListGetRecordMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembership>> =
            getRecordMemberships(params.toBuilder().recordId(recordId).build(), requestOptions)

        /** @see getRecordMemberships */
        fun getRecordMemberships(
            params: ListGetRecordMembershipsParams
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembership>> =
            getRecordMemberships(params, RequestOptions.none())

        /** @see getRecordMemberships */
        fun getRecordMemberships(
            params: ListGetRecordMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembership>>

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/{listId}/schedule-conversion`,
         * but is otherwise the same as [ListServiceAsync.getScheduleConversion].
         */
        fun getScheduleConversion(
            listId: String
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            getScheduleConversion(listId, ListGetScheduleConversionParams.none())

        /** @see getScheduleConversion */
        fun getScheduleConversion(
            listId: String,
            params: ListGetScheduleConversionParams = ListGetScheduleConversionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            getScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see getScheduleConversion */
        fun getScheduleConversion(
            listId: String,
            params: ListGetScheduleConversionParams = ListGetScheduleConversionParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            getScheduleConversion(listId, params, RequestOptions.none())

        /** @see getScheduleConversion */
        fun getScheduleConversion(
            params: ListGetScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>>

        /** @see getScheduleConversion */
        fun getScheduleConversion(
            params: ListGetScheduleConversionParams
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            getScheduleConversion(params, RequestOptions.none())

        /** @see getScheduleConversion */
        fun getScheduleConversion(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            getScheduleConversion(listId, ListGetScheduleConversionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/lists/2026-03/{listId}/size-and-edits-history/between`, but is otherwise the same as
         * [ListServiceAsync.getSizeAndEditsHistoryBetween].
         */
        fun getSizeAndEditsHistoryBetween(
            listId: String
        ): CompletableFuture<HttpResponseFor<ListSizeAndEditHistoryResponse>> =
            getSizeAndEditsHistoryBetween(listId, ListGetSizeAndEditsHistoryBetweenParams.none())

        /** @see getSizeAndEditsHistoryBetween */
        fun getSizeAndEditsHistoryBetween(
            listId: String,
            params: ListGetSizeAndEditsHistoryBetweenParams =
                ListGetSizeAndEditsHistoryBetweenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListSizeAndEditHistoryResponse>> =
            getSizeAndEditsHistoryBetween(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see getSizeAndEditsHistoryBetween */
        fun getSizeAndEditsHistoryBetween(
            listId: String,
            params: ListGetSizeAndEditsHistoryBetweenParams =
                ListGetSizeAndEditsHistoryBetweenParams.none(),
        ): CompletableFuture<HttpResponseFor<ListSizeAndEditHistoryResponse>> =
            getSizeAndEditsHistoryBetween(listId, params, RequestOptions.none())

        /** @see getSizeAndEditsHistoryBetween */
        fun getSizeAndEditsHistoryBetween(
            params: ListGetSizeAndEditsHistoryBetweenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListSizeAndEditHistoryResponse>>

        /** @see getSizeAndEditsHistoryBetween */
        fun getSizeAndEditsHistoryBetween(
            params: ListGetSizeAndEditsHistoryBetweenParams
        ): CompletableFuture<HttpResponseFor<ListSizeAndEditHistoryResponse>> =
            getSizeAndEditsHistoryBetween(params, RequestOptions.none())

        /** @see getSizeAndEditsHistoryBetween */
        fun getSizeAndEditsHistoryBetween(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListSizeAndEditHistoryResponse>> =
            getSizeAndEditsHistoryBetween(
                listId,
                ListGetSizeAndEditsHistoryBetweenParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03/search`, but is otherwise the
         * same as [ListServiceAsync.listBySearch].
         */
        fun listBySearch(
            params: ListListBySearchParams
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>> =
            listBySearch(params, RequestOptions.none())

        /** @see listBySearch */
        fun listBySearch(
            params: ListListBySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>>

        /** @see listBySearch */
        fun listBySearch(
            listSearchRequest: ListSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>> =
            listBySearch(
                ListListBySearchParams.builder().listSearchRequest(listSearchRequest).build(),
                requestOptions,
            )

        /** @see listBySearch */
        fun listBySearch(
            listSearchRequest: ListSearchRequest
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>> =
            listBySearch(listSearchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/folders`, but is otherwise the
         * same as [ListServiceAsync.listFolders].
         */
        fun listFolders(): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            listFolders(ListListFoldersParams.none())

        /** @see listFolders */
        fun listFolders(
            params: ListListFoldersParams = ListListFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>>

        /** @see listFolders */
        fun listFolders(
            params: ListListFoldersParams = ListListFoldersParams.none()
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            listFolders(params, RequestOptions.none())

        /** @see listFolders */
        fun listFolders(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            listFolders(ListListFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/{listId}/memberships`, but is
         * otherwise the same as [ListServiceAsync.listMemberships].
         */
        fun listMemberships(
            listId: String
        ): CompletableFuture<HttpResponseFor<ListListMembershipsPageAsync>> =
            listMemberships(listId, ListListMembershipsParams.none())

        /** @see listMemberships */
        fun listMemberships(
            listId: String,
            params: ListListMembershipsParams = ListListMembershipsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListListMembershipsPageAsync>> =
            listMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see listMemberships */
        fun listMemberships(
            listId: String,
            params: ListListMembershipsParams = ListListMembershipsParams.none(),
        ): CompletableFuture<HttpResponseFor<ListListMembershipsPageAsync>> =
            listMemberships(listId, params, RequestOptions.none())

        /** @see listMemberships */
        fun listMemberships(
            params: ListListMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListListMembershipsPageAsync>>

        /** @see listMemberships */
        fun listMemberships(
            params: ListListMembershipsParams
        ): CompletableFuture<HttpResponseFor<ListListMembershipsPageAsync>> =
            listMemberships(params, RequestOptions.none())

        /** @see listMemberships */
        fun listMemberships(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListListMembershipsPageAsync>> =
            listMemberships(listId, ListListMembershipsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /crm/lists/2026-03/folders/{folderId}/move/{newParentFolderId}`, but is otherwise the
         * same as [ListServiceAsync.moveFolder].
         */
        fun moveFolder(
            newParentFolderId: String,
            params: ListMoveFolderParams,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            moveFolder(newParentFolderId, params, RequestOptions.none())

        /** @see moveFolder */
        fun moveFolder(
            newParentFolderId: String,
            params: ListMoveFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            moveFolder(
                params.toBuilder().newParentFolderId(newParentFolderId).build(),
                requestOptions,
            )

        /** @see moveFolder */
        fun moveFolder(
            params: ListMoveFolderParams
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            moveFolder(params, RequestOptions.none())

        /** @see moveFolder */
        fun moveFolder(
            params: ListMoveFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>>

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/folders/move-list`, but is
         * otherwise the same as [ListServiceAsync.moveList].
         */
        fun moveList(params: ListMoveListParams): CompletableFuture<HttpResponse> =
            moveList(params, RequestOptions.none())

        /** @see moveList */
        fun moveList(
            params: ListMoveListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see moveList */
        fun moveList(
            listMoveRequest: ListMoveRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            moveList(
                ListMoveListParams.builder().listMoveRequest(listMoveRequest).build(),
                requestOptions,
            )

        /** @see moveList */
        fun moveList(listMoveRequest: ListMoveRequest): CompletableFuture<HttpResponse> =
            moveList(listMoveRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/memberships/remove`, but
         * is otherwise the same as [ListServiceAsync.removeMemberships].
         */
        fun removeMemberships(
            listId: String,
            params: ListRemoveMembershipsParams,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            removeMemberships(listId, params, RequestOptions.none())

        /** @see removeMemberships */
        fun removeMemberships(
            listId: String,
            params: ListRemoveMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            removeMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see removeMemberships */
        fun removeMemberships(
            params: ListRemoveMembershipsParams
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            removeMemberships(params, RequestOptions.none())

        /** @see removeMemberships */
        fun removeMemberships(
            params: ListRemoveMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>>

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/folders/{folderId}/rename`, but
         * is otherwise the same as [ListServiceAsync.renameFolder].
         */
        fun renameFolder(
            folderId: String
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            renameFolder(folderId, ListRenameFolderParams.none())

        /** @see renameFolder */
        fun renameFolder(
            folderId: String,
            params: ListRenameFolderParams = ListRenameFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            renameFolder(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see renameFolder */
        fun renameFolder(
            folderId: String,
            params: ListRenameFolderParams = ListRenameFolderParams.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            renameFolder(folderId, params, RequestOptions.none())

        /** @see renameFolder */
        fun renameFolder(
            params: ListRenameFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>>

        /** @see renameFolder */
        fun renameFolder(
            params: ListRenameFolderParams
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            renameFolder(params, RequestOptions.none())

        /** @see renameFolder */
        fun renameFolder(
            folderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            renameFolder(folderId, ListRenameFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/restore`, but is
         * otherwise the same as [ListServiceAsync.restore].
         */
        fun restore(listId: String): CompletableFuture<HttpResponse> =
            restore(listId, ListRestoreParams.none())

        /** @see restore */
        fun restore(
            listId: String,
            params: ListRestoreParams = ListRestoreParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            restore(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see restore */
        fun restore(
            listId: String,
            params: ListRestoreParams = ListRestoreParams.none(),
        ): CompletableFuture<HttpResponse> = restore(listId, params, RequestOptions.none())

        /** @see restore */
        fun restore(
            params: ListRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see restore */
        fun restore(params: ListRestoreParams): CompletableFuture<HttpResponse> =
            restore(params, RequestOptions.none())

        /** @see restore */
        fun restore(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            restore(listId, ListRestoreParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/lists/2026-03/{listId}/schedule-conversion`,
         * but is otherwise the same as [ListServiceAsync.scheduleConversion].
         */
        fun scheduleConversion(listId: String): CompletableFuture<HttpResponse> =
            scheduleConversion(listId, ListScheduleConversionParams.none())

        /** @see scheduleConversion */
        fun scheduleConversion(
            listId: String,
            params: ListScheduleConversionParams = ListScheduleConversionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            scheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see scheduleConversion */
        fun scheduleConversion(
            listId: String,
            params: ListScheduleConversionParams = ListScheduleConversionParams.none(),
        ): CompletableFuture<HttpResponse> =
            scheduleConversion(listId, params, RequestOptions.none())

        /** @see scheduleConversion */
        fun scheduleConversion(
            params: ListScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see scheduleConversion */
        fun scheduleConversion(
            params: ListScheduleConversionParams
        ): CompletableFuture<HttpResponse> = scheduleConversion(params, RequestOptions.none())

        /** @see scheduleConversion */
        fun scheduleConversion(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            scheduleConversion(listId, ListScheduleConversionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/update-list-filters`,
         * but is otherwise the same as [ListServiceAsync.updateListFilters].
         */
        fun updateListFilters(
            listId: String,
            params: ListUpdateListFiltersParams,
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateListFilters(listId, params, RequestOptions.none())

        /** @see updateListFilters */
        fun updateListFilters(
            listId: String,
            params: ListUpdateListFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateListFilters(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateListFilters */
        fun updateListFilters(
            params: ListUpdateListFiltersParams
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateListFilters(params, RequestOptions.none())

        /** @see updateListFilters */
        fun updateListFilters(
            params: ListUpdateListFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>>

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/update-list-name`, but
         * is otherwise the same as [ListServiceAsync.updateListName].
         */
        fun updateListName(listId: String): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateListName(listId, ListUpdateListNameParams.none())

        /** @see updateListName */
        fun updateListName(
            listId: String,
            params: ListUpdateListNameParams = ListUpdateListNameParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateListName(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateListName */
        fun updateListName(
            listId: String,
            params: ListUpdateListNameParams = ListUpdateListNameParams.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateListName(listId, params, RequestOptions.none())

        /** @see updateListName */
        fun updateListName(
            params: ListUpdateListNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>>

        /** @see updateListName */
        fun updateListName(
            params: ListUpdateListNameParams
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateListName(params, RequestOptions.none())

        /** @see updateListName */
        fun updateListName(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateListName(listId, ListUpdateListNameParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/schedule-conversion`,
         * but is otherwise the same as [ListServiceAsync.updateScheduleConversion].
         */
        fun updateScheduleConversion(
            listId: String,
            params: ListUpdateScheduleConversionParams,
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            updateScheduleConversion(listId, params, RequestOptions.none())

        /** @see updateScheduleConversion */
        fun updateScheduleConversion(
            listId: String,
            params: ListUpdateScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            updateScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateScheduleConversion */
        fun updateScheduleConversion(
            params: ListUpdateScheduleConversionParams
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            updateScheduleConversion(params, RequestOptions.none())

        /** @see updateScheduleConversion */
        fun updateScheduleConversion(
            params: ListUpdateScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>>
    }
}
