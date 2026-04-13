// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.lists.ApiCollectionResponseRecordListMembership
import com.hubspot.models.crm.lists.BatchInputRecordIdInput
import com.hubspot.models.crm.lists.BatchResponseRecordIdWithMemberships
import com.hubspot.models.crm.lists.ListAddAndRemoveMembershipsParams
import com.hubspot.models.crm.lists.ListAddMembershipsFromParams
import com.hubspot.models.crm.lists.ListAddMembershipsParams
import com.hubspot.models.crm.lists.ListBatchReadMembershipsParams
import com.hubspot.models.crm.lists.ListCreateFolderParams
import com.hubspot.models.crm.lists.ListCreateIdMappingParams
import com.hubspot.models.crm.lists.ListCreateParams
import com.hubspot.models.crm.lists.ListCreateRequest
import com.hubspot.models.crm.lists.ListCreateResponse
import com.hubspot.models.crm.lists.ListDeleteFolderParams
import com.hubspot.models.crm.lists.ListDeleteMembershipsParams
import com.hubspot.models.crm.lists.ListDeleteParams
import com.hubspot.models.crm.lists.ListFetchResponse
import com.hubspot.models.crm.lists.ListFolderCreateRequest
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
import com.hubspot.models.crm.lists.ListMoveRequest
import com.hubspot.models.crm.lists.ListRemoveMembershipsParams
import com.hubspot.models.crm.lists.ListRenameFolderParams
import com.hubspot.models.crm.lists.ListRestoreParams
import com.hubspot.models.crm.lists.ListScheduleConversionParams
import com.hubspot.models.crm.lists.ListSearchRequest
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

interface ListService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService

    fun create(params: ListCreateParams): ListCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ListCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListCreateResponse

    /** @see create */
    fun create(
        listCreateRequest: ListCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListCreateResponse =
        create(
            ListCreateParams.builder().listCreateRequest(listCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(listCreateRequest: ListCreateRequest): ListCreateResponse =
        create(listCreateRequest, RequestOptions.none())

    fun list(): ListsByIdResponse = list(ListListParams.none())

    /** @see list */
    fun list(
        params: ListListParams = ListListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListsByIdResponse

    /** @see list */
    fun list(params: ListListParams = ListListParams.none()): ListsByIdResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ListsByIdResponse =
        list(ListListParams.none(), requestOptions)

    fun delete(listId: String) = delete(listId, ListDeleteParams.none())

    /** @see delete */
    fun delete(
        listId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see delete */
    fun delete(listId: String, params: ListDeleteParams = ListDeleteParams.none()) =
        delete(listId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ListDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ListDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(listId: String, requestOptions: RequestOptions) =
        delete(listId, ListDeleteParams.none(), requestOptions)

    fun addAndRemoveMemberships(
        listId: String,
        params: ListAddAndRemoveMembershipsParams,
    ): MembershipsUpdateResponse = addAndRemoveMemberships(listId, params, RequestOptions.none())

    /** @see addAndRemoveMemberships */
    fun addAndRemoveMemberships(
        listId: String,
        params: ListAddAndRemoveMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse =
        addAndRemoveMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see addAndRemoveMemberships */
    fun addAndRemoveMemberships(
        params: ListAddAndRemoveMembershipsParams
    ): MembershipsUpdateResponse = addAndRemoveMemberships(params, RequestOptions.none())

    /** @see addAndRemoveMemberships */
    fun addAndRemoveMemberships(
        params: ListAddAndRemoveMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse

    fun addMemberships(
        listId: String,
        params: ListAddMembershipsParams,
    ): MembershipsUpdateResponse = addMemberships(listId, params, RequestOptions.none())

    /** @see addMemberships */
    fun addMemberships(
        listId: String,
        params: ListAddMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse =
        addMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see addMemberships */
    fun addMemberships(params: ListAddMembershipsParams): MembershipsUpdateResponse =
        addMemberships(params, RequestOptions.none())

    /** @see addMemberships */
    fun addMemberships(
        params: ListAddMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse

    fun addMembershipsFrom(sourceListId: String, params: ListAddMembershipsFromParams) =
        addMembershipsFrom(sourceListId, params, RequestOptions.none())

    /** @see addMembershipsFrom */
    fun addMembershipsFrom(
        sourceListId: String,
        params: ListAddMembershipsFromParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addMembershipsFrom(params.toBuilder().sourceListId(sourceListId).build(), requestOptions)

    /** @see addMembershipsFrom */
    fun addMembershipsFrom(params: ListAddMembershipsFromParams) =
        addMembershipsFrom(params, RequestOptions.none())

    /** @see addMembershipsFrom */
    fun addMembershipsFrom(
        params: ListAddMembershipsFromParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun batchReadMemberships(
        params: ListBatchReadMembershipsParams
    ): BatchResponseRecordIdWithMemberships = batchReadMemberships(params, RequestOptions.none())

    /** @see batchReadMemberships */
    fun batchReadMemberships(
        params: ListBatchReadMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseRecordIdWithMemberships

    /** @see batchReadMemberships */
    fun batchReadMemberships(
        batchInputRecordIdInput: BatchInputRecordIdInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseRecordIdWithMemberships =
        batchReadMemberships(
            ListBatchReadMembershipsParams.builder()
                .batchInputRecordIdInput(batchInputRecordIdInput)
                .build(),
            requestOptions,
        )

    /** @see batchReadMemberships */
    fun batchReadMemberships(
        batchInputRecordIdInput: BatchInputRecordIdInput
    ): BatchResponseRecordIdWithMemberships =
        batchReadMemberships(batchInputRecordIdInput, RequestOptions.none())

    fun createFolder(params: ListCreateFolderParams): ListFolderCreateResponse =
        createFolder(params, RequestOptions.none())

    /** @see createFolder */
    fun createFolder(
        params: ListCreateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderCreateResponse

    /** @see createFolder */
    fun createFolder(
        listFolderCreateRequest: ListFolderCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderCreateResponse =
        createFolder(
            ListCreateFolderParams.builder()
                .listFolderCreateRequest(listFolderCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see createFolder */
    fun createFolder(listFolderCreateRequest: ListFolderCreateRequest): ListFolderCreateResponse =
        createFolder(listFolderCreateRequest, RequestOptions.none())

    fun createIdMapping(params: ListCreateIdMappingParams): PublicBatchMigrationMapping =
        createIdMapping(params, RequestOptions.none())

    /** @see createIdMapping */
    fun createIdMapping(
        params: ListCreateIdMappingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBatchMigrationMapping

    /** @see createIdMapping */
    fun createIdMapping(
        body: List<String>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicBatchMigrationMapping =
        createIdMapping(ListCreateIdMappingParams.builder().body(body).build(), requestOptions)

    /** @see createIdMapping */
    fun createIdMapping(body: List<String>): PublicBatchMigrationMapping =
        createIdMapping(body, RequestOptions.none())

    fun deleteFolder(folderId: String) = deleteFolder(folderId, ListDeleteFolderParams.none())

    /** @see deleteFolder */
    fun deleteFolder(
        folderId: String,
        params: ListDeleteFolderParams = ListDeleteFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteFolder(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see deleteFolder */
    fun deleteFolder(
        folderId: String,
        params: ListDeleteFolderParams = ListDeleteFolderParams.none(),
    ) = deleteFolder(folderId, params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(
        params: ListDeleteFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteFolder */
    fun deleteFolder(params: ListDeleteFolderParams) = deleteFolder(params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(folderId: String, requestOptions: RequestOptions) =
        deleteFolder(folderId, ListDeleteFolderParams.none(), requestOptions)

    fun deleteMemberships(listId: String) =
        deleteMemberships(listId, ListDeleteMembershipsParams.none())

    /** @see deleteMemberships */
    fun deleteMemberships(
        listId: String,
        params: ListDeleteMembershipsParams = ListDeleteMembershipsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see deleteMemberships */
    fun deleteMemberships(
        listId: String,
        params: ListDeleteMembershipsParams = ListDeleteMembershipsParams.none(),
    ) = deleteMemberships(listId, params, RequestOptions.none())

    /** @see deleteMemberships */
    fun deleteMemberships(
        params: ListDeleteMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteMemberships */
    fun deleteMemberships(params: ListDeleteMembershipsParams) =
        deleteMemberships(params, RequestOptions.none())

    /** @see deleteMemberships */
    fun deleteMemberships(listId: String, requestOptions: RequestOptions) =
        deleteMemberships(listId, ListDeleteMembershipsParams.none(), requestOptions)

    fun get(listId: String): ListFetchResponse = get(listId, ListGetParams.none())

    /** @see get */
    fun get(
        listId: String,
        params: ListGetParams = ListGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFetchResponse = get(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see get */
    fun get(listId: String, params: ListGetParams = ListGetParams.none()): ListFetchResponse =
        get(listId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ListGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFetchResponse

    /** @see get */
    fun get(params: ListGetParams): ListFetchResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(listId: String, requestOptions: RequestOptions): ListFetchResponse =
        get(listId, ListGetParams.none(), requestOptions)

    fun getByObjectTypeAndName(
        listName: String,
        params: ListGetByObjectTypeAndNameParams,
    ): ListFetchResponse = getByObjectTypeAndName(listName, params, RequestOptions.none())

    /** @see getByObjectTypeAndName */
    fun getByObjectTypeAndName(
        listName: String,
        params: ListGetByObjectTypeAndNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFetchResponse =
        getByObjectTypeAndName(params.toBuilder().listName(listName).build(), requestOptions)

    /** @see getByObjectTypeAndName */
    fun getByObjectTypeAndName(params: ListGetByObjectTypeAndNameParams): ListFetchResponse =
        getByObjectTypeAndName(params, RequestOptions.none())

    /** @see getByObjectTypeAndName */
    fun getByObjectTypeAndName(
        params: ListGetByObjectTypeAndNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFetchResponse

    fun getIdMapping(): PublicMigrationMapping = getIdMapping(ListGetIdMappingParams.none())

    /** @see getIdMapping */
    fun getIdMapping(
        params: ListGetIdMappingParams = ListGetIdMappingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicMigrationMapping

    /** @see getIdMapping */
    fun getIdMapping(
        params: ListGetIdMappingParams = ListGetIdMappingParams.none()
    ): PublicMigrationMapping = getIdMapping(params, RequestOptions.none())

    /** @see getIdMapping */
    fun getIdMapping(requestOptions: RequestOptions): PublicMigrationMapping =
        getIdMapping(ListGetIdMappingParams.none(), requestOptions)

    fun getMembershipsJoinOrder(listId: String): ListGetMembershipsJoinOrderPage =
        getMembershipsJoinOrder(listId, ListGetMembershipsJoinOrderParams.none())

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        listId: String,
        params: ListGetMembershipsJoinOrderParams = ListGetMembershipsJoinOrderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListGetMembershipsJoinOrderPage =
        getMembershipsJoinOrder(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        listId: String,
        params: ListGetMembershipsJoinOrderParams = ListGetMembershipsJoinOrderParams.none(),
    ): ListGetMembershipsJoinOrderPage =
        getMembershipsJoinOrder(listId, params, RequestOptions.none())

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        params: ListGetMembershipsJoinOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListGetMembershipsJoinOrderPage

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        params: ListGetMembershipsJoinOrderParams
    ): ListGetMembershipsJoinOrderPage = getMembershipsJoinOrder(params, RequestOptions.none())

    /** @see getMembershipsJoinOrder */
    fun getMembershipsJoinOrder(
        listId: String,
        requestOptions: RequestOptions,
    ): ListGetMembershipsJoinOrderPage =
        getMembershipsJoinOrder(listId, ListGetMembershipsJoinOrderParams.none(), requestOptions)

    fun getRecordMemberships(
        recordId: String,
        params: ListGetRecordMembershipsParams,
    ): ApiCollectionResponseRecordListMembership =
        getRecordMemberships(recordId, params, RequestOptions.none())

    /** @see getRecordMemberships */
    fun getRecordMemberships(
        recordId: String,
        params: ListGetRecordMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiCollectionResponseRecordListMembership =
        getRecordMemberships(params.toBuilder().recordId(recordId).build(), requestOptions)

    /** @see getRecordMemberships */
    fun getRecordMemberships(
        params: ListGetRecordMembershipsParams
    ): ApiCollectionResponseRecordListMembership =
        getRecordMemberships(params, RequestOptions.none())

    /** @see getRecordMemberships */
    fun getRecordMemberships(
        params: ListGetRecordMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiCollectionResponseRecordListMembership

    fun getScheduleConversion(listId: String): PublicListConversionResponse =
        getScheduleConversion(listId, ListGetScheduleConversionParams.none())

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        listId: String,
        params: ListGetScheduleConversionParams = ListGetScheduleConversionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicListConversionResponse =
        getScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        listId: String,
        params: ListGetScheduleConversionParams = ListGetScheduleConversionParams.none(),
    ): PublicListConversionResponse = getScheduleConversion(listId, params, RequestOptions.none())

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        params: ListGetScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicListConversionResponse

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        params: ListGetScheduleConversionParams
    ): PublicListConversionResponse = getScheduleConversion(params, RequestOptions.none())

    /** @see getScheduleConversion */
    fun getScheduleConversion(
        listId: String,
        requestOptions: RequestOptions,
    ): PublicListConversionResponse =
        getScheduleConversion(listId, ListGetScheduleConversionParams.none(), requestOptions)

    fun getSizeAndEditsHistoryBetween(listId: String): ListSizeAndEditHistoryResponse =
        getSizeAndEditsHistoryBetween(listId, ListGetSizeAndEditsHistoryBetweenParams.none())

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        listId: String,
        params: ListGetSizeAndEditsHistoryBetweenParams =
            ListGetSizeAndEditsHistoryBetweenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListSizeAndEditHistoryResponse =
        getSizeAndEditsHistoryBetween(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        listId: String,
        params: ListGetSizeAndEditsHistoryBetweenParams =
            ListGetSizeAndEditsHistoryBetweenParams.none(),
    ): ListSizeAndEditHistoryResponse =
        getSizeAndEditsHistoryBetween(listId, params, RequestOptions.none())

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        params: ListGetSizeAndEditsHistoryBetweenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListSizeAndEditHistoryResponse

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        params: ListGetSizeAndEditsHistoryBetweenParams
    ): ListSizeAndEditHistoryResponse = getSizeAndEditsHistoryBetween(params, RequestOptions.none())

    /** @see getSizeAndEditsHistoryBetween */
    fun getSizeAndEditsHistoryBetween(
        listId: String,
        requestOptions: RequestOptions,
    ): ListSizeAndEditHistoryResponse =
        getSizeAndEditsHistoryBetween(
            listId,
            ListGetSizeAndEditsHistoryBetweenParams.none(),
            requestOptions,
        )

    fun listBySearch(params: ListListBySearchParams): ListSearchResponse =
        listBySearch(params, RequestOptions.none())

    /** @see listBySearch */
    fun listBySearch(
        params: ListListBySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListSearchResponse

    /** @see listBySearch */
    fun listBySearch(
        listSearchRequest: ListSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListSearchResponse =
        listBySearch(
            ListListBySearchParams.builder().listSearchRequest(listSearchRequest).build(),
            requestOptions,
        )

    /** @see listBySearch */
    fun listBySearch(listSearchRequest: ListSearchRequest): ListSearchResponse =
        listBySearch(listSearchRequest, RequestOptions.none())

    fun listFolders(): ListFolderFetchResponse = listFolders(ListListFoldersParams.none())

    /** @see listFolders */
    fun listFolders(
        params: ListListFoldersParams = ListListFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse

    /** @see listFolders */
    fun listFolders(
        params: ListListFoldersParams = ListListFoldersParams.none()
    ): ListFolderFetchResponse = listFolders(params, RequestOptions.none())

    /** @see listFolders */
    fun listFolders(requestOptions: RequestOptions): ListFolderFetchResponse =
        listFolders(ListListFoldersParams.none(), requestOptions)

    fun listMemberships(listId: String): ListListMembershipsPage =
        listMemberships(listId, ListListMembershipsParams.none())

    /** @see listMemberships */
    fun listMemberships(
        listId: String,
        params: ListListMembershipsParams = ListListMembershipsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListListMembershipsPage =
        listMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see listMemberships */
    fun listMemberships(
        listId: String,
        params: ListListMembershipsParams = ListListMembershipsParams.none(),
    ): ListListMembershipsPage = listMemberships(listId, params, RequestOptions.none())

    /** @see listMemberships */
    fun listMemberships(
        params: ListListMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListListMembershipsPage

    /** @see listMemberships */
    fun listMemberships(params: ListListMembershipsParams): ListListMembershipsPage =
        listMemberships(params, RequestOptions.none())

    /** @see listMemberships */
    fun listMemberships(listId: String, requestOptions: RequestOptions): ListListMembershipsPage =
        listMemberships(listId, ListListMembershipsParams.none(), requestOptions)

    fun moveFolder(
        newParentFolderId: String,
        params: ListMoveFolderParams,
    ): ListFolderFetchResponse = moveFolder(newParentFolderId, params, RequestOptions.none())

    /** @see moveFolder */
    fun moveFolder(
        newParentFolderId: String,
        params: ListMoveFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse =
        moveFolder(params.toBuilder().newParentFolderId(newParentFolderId).build(), requestOptions)

    /** @see moveFolder */
    fun moveFolder(params: ListMoveFolderParams): ListFolderFetchResponse =
        moveFolder(params, RequestOptions.none())

    /** @see moveFolder */
    fun moveFolder(
        params: ListMoveFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse

    fun moveList(params: ListMoveListParams) = moveList(params, RequestOptions.none())

    /** @see moveList */
    fun moveList(params: ListMoveListParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see moveList */
    fun moveList(
        listMoveRequest: ListMoveRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        moveList(
            ListMoveListParams.builder().listMoveRequest(listMoveRequest).build(),
            requestOptions,
        )

    /** @see moveList */
    fun moveList(listMoveRequest: ListMoveRequest) =
        moveList(listMoveRequest, RequestOptions.none())

    fun removeMemberships(
        listId: String,
        params: ListRemoveMembershipsParams,
    ): MembershipsUpdateResponse = removeMemberships(listId, params, RequestOptions.none())

    /** @see removeMemberships */
    fun removeMemberships(
        listId: String,
        params: ListRemoveMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse =
        removeMemberships(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see removeMemberships */
    fun removeMemberships(params: ListRemoveMembershipsParams): MembershipsUpdateResponse =
        removeMemberships(params, RequestOptions.none())

    /** @see removeMemberships */
    fun removeMemberships(
        params: ListRemoveMembershipsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse

    fun renameFolder(folderId: String): ListFolderFetchResponse =
        renameFolder(folderId, ListRenameFolderParams.none())

    /** @see renameFolder */
    fun renameFolder(
        folderId: String,
        params: ListRenameFolderParams = ListRenameFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse =
        renameFolder(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see renameFolder */
    fun renameFolder(
        folderId: String,
        params: ListRenameFolderParams = ListRenameFolderParams.none(),
    ): ListFolderFetchResponse = renameFolder(folderId, params, RequestOptions.none())

    /** @see renameFolder */
    fun renameFolder(
        params: ListRenameFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse

    /** @see renameFolder */
    fun renameFolder(params: ListRenameFolderParams): ListFolderFetchResponse =
        renameFolder(params, RequestOptions.none())

    /** @see renameFolder */
    fun renameFolder(folderId: String, requestOptions: RequestOptions): ListFolderFetchResponse =
        renameFolder(folderId, ListRenameFolderParams.none(), requestOptions)

    fun restore(listId: String) = restore(listId, ListRestoreParams.none())

    /** @see restore */
    fun restore(
        listId: String,
        params: ListRestoreParams = ListRestoreParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = restore(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see restore */
    fun restore(listId: String, params: ListRestoreParams = ListRestoreParams.none()) =
        restore(listId, params, RequestOptions.none())

    /** @see restore */
    fun restore(params: ListRestoreParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see restore */
    fun restore(params: ListRestoreParams) = restore(params, RequestOptions.none())

    /** @see restore */
    fun restore(listId: String, requestOptions: RequestOptions) =
        restore(listId, ListRestoreParams.none(), requestOptions)

    fun scheduleConversion(listId: String) =
        scheduleConversion(listId, ListScheduleConversionParams.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        listId: String,
        params: ListScheduleConversionParams = ListScheduleConversionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = scheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see scheduleConversion */
    fun scheduleConversion(
        listId: String,
        params: ListScheduleConversionParams = ListScheduleConversionParams.none(),
    ) = scheduleConversion(listId, params, RequestOptions.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see scheduleConversion */
    fun scheduleConversion(params: ListScheduleConversionParams) =
        scheduleConversion(params, RequestOptions.none())

    /** @see scheduleConversion */
    fun scheduleConversion(listId: String, requestOptions: RequestOptions) =
        scheduleConversion(listId, ListScheduleConversionParams.none(), requestOptions)

    fun updateListFilters(listId: String, params: ListUpdateListFiltersParams): ListUpdateResponse =
        updateListFilters(listId, params, RequestOptions.none())

    /** @see updateListFilters */
    fun updateListFilters(
        listId: String,
        params: ListUpdateListFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListUpdateResponse =
        updateListFilters(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateListFilters */
    fun updateListFilters(params: ListUpdateListFiltersParams): ListUpdateResponse =
        updateListFilters(params, RequestOptions.none())

    /** @see updateListFilters */
    fun updateListFilters(
        params: ListUpdateListFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListUpdateResponse

    fun updateListName(listId: String): ListUpdateResponse =
        updateListName(listId, ListUpdateListNameParams.none())

    /** @see updateListName */
    fun updateListName(
        listId: String,
        params: ListUpdateListNameParams = ListUpdateListNameParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListUpdateResponse =
        updateListName(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateListName */
    fun updateListName(
        listId: String,
        params: ListUpdateListNameParams = ListUpdateListNameParams.none(),
    ): ListUpdateResponse = updateListName(listId, params, RequestOptions.none())

    /** @see updateListName */
    fun updateListName(
        params: ListUpdateListNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListUpdateResponse

    /** @see updateListName */
    fun updateListName(params: ListUpdateListNameParams): ListUpdateResponse =
        updateListName(params, RequestOptions.none())

    /** @see updateListName */
    fun updateListName(listId: String, requestOptions: RequestOptions): ListUpdateResponse =
        updateListName(listId, ListUpdateListNameParams.none(), requestOptions)

    fun updateScheduleConversion(
        listId: String,
        params: ListUpdateScheduleConversionParams,
    ): PublicListConversionResponse =
        updateScheduleConversion(listId, params, RequestOptions.none())

    /** @see updateScheduleConversion */
    fun updateScheduleConversion(
        listId: String,
        params: ListUpdateScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicListConversionResponse =
        updateScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateScheduleConversion */
    fun updateScheduleConversion(
        params: ListUpdateScheduleConversionParams
    ): PublicListConversionResponse = updateScheduleConversion(params, RequestOptions.none())

    /** @see updateScheduleConversion */
    fun updateScheduleConversion(
        params: ListUpdateScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicListConversionResponse

    /** A view of [ListService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03`, but is otherwise the same as
         * [ListService.create].
         */
        @MustBeClosed
        fun create(params: ListCreateParams): HttpResponseFor<ListCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ListCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            listCreateRequest: ListCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListCreateResponse> =
            create(
                ListCreateParams.builder().listCreateRequest(listCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(listCreateRequest: ListCreateRequest): HttpResponseFor<ListCreateResponse> =
            create(listCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03`, but is otherwise the same as
         * [ListService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ListsByIdResponse> = list(ListListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ListListParams = ListListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListsByIdResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ListListParams = ListListParams.none()
        ): HttpResponseFor<ListsByIdResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ListsByIdResponse> =
            list(ListListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/lists/2026-03/{listId}`, but is otherwise
         * the same as [ListService.delete].
         */
        @MustBeClosed
        fun delete(listId: String): HttpResponse = delete(listId, ListDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            listId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            listId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
        ): HttpResponse = delete(listId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ListDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(listId: String, requestOptions: RequestOptions): HttpResponse =
            delete(listId, ListDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /crm/lists/2026-03/{listId}/memberships/add-and-remove`, but is otherwise the same as
         * [ListService.addAndRemoveMemberships].
         */
        @MustBeClosed
        fun addAndRemoveMemberships(
            listId: String,
            params: ListAddAndRemoveMembershipsParams,
        ): HttpResponseFor<MembershipsUpdateResponse> =
            addAndRemoveMemberships(listId, params, RequestOptions.none())

        /** @see addAndRemoveMemberships */
        @MustBeClosed
        fun addAndRemoveMemberships(
            listId: String,
            params: ListAddAndRemoveMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse> =
            addAndRemoveMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see addAndRemoveMemberships */
        @MustBeClosed
        fun addAndRemoveMemberships(
            params: ListAddAndRemoveMembershipsParams
        ): HttpResponseFor<MembershipsUpdateResponse> =
            addAndRemoveMemberships(params, RequestOptions.none())

        /** @see addAndRemoveMemberships */
        @MustBeClosed
        fun addAndRemoveMemberships(
            params: ListAddAndRemoveMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse>

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/memberships/add`, but is
         * otherwise the same as [ListService.addMemberships].
         */
        @MustBeClosed
        fun addMemberships(
            listId: String,
            params: ListAddMembershipsParams,
        ): HttpResponseFor<MembershipsUpdateResponse> =
            addMemberships(listId, params, RequestOptions.none())

        /** @see addMemberships */
        @MustBeClosed
        fun addMemberships(
            listId: String,
            params: ListAddMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse> =
            addMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see addMemberships */
        @MustBeClosed
        fun addMemberships(
            params: ListAddMembershipsParams
        ): HttpResponseFor<MembershipsUpdateResponse> =
            addMemberships(params, RequestOptions.none())

        /** @see addMemberships */
        @MustBeClosed
        fun addMemberships(
            params: ListAddMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse>

        /**
         * Returns a raw HTTP response for `put
         * /crm/lists/2026-03/{listId}/memberships/add-from/{sourceListId}`, but is otherwise the
         * same as [ListService.addMembershipsFrom].
         */
        @MustBeClosed
        fun addMembershipsFrom(
            sourceListId: String,
            params: ListAddMembershipsFromParams,
        ): HttpResponse = addMembershipsFrom(sourceListId, params, RequestOptions.none())

        /** @see addMembershipsFrom */
        @MustBeClosed
        fun addMembershipsFrom(
            sourceListId: String,
            params: ListAddMembershipsFromParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            addMembershipsFrom(
                params.toBuilder().sourceListId(sourceListId).build(),
                requestOptions,
            )

        /** @see addMembershipsFrom */
        @MustBeClosed
        fun addMembershipsFrom(params: ListAddMembershipsFromParams): HttpResponse =
            addMembershipsFrom(params, RequestOptions.none())

        /** @see addMembershipsFrom */
        @MustBeClosed
        fun addMembershipsFrom(
            params: ListAddMembershipsFromParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03/records/memberships/batch/read`,
         * but is otherwise the same as [ListService.batchReadMemberships].
         */
        @MustBeClosed
        fun batchReadMemberships(
            params: ListBatchReadMembershipsParams
        ): HttpResponseFor<BatchResponseRecordIdWithMemberships> =
            batchReadMemberships(params, RequestOptions.none())

        /** @see batchReadMemberships */
        @MustBeClosed
        fun batchReadMemberships(
            params: ListBatchReadMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseRecordIdWithMemberships>

        /** @see batchReadMemberships */
        @MustBeClosed
        fun batchReadMemberships(
            batchInputRecordIdInput: BatchInputRecordIdInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseRecordIdWithMemberships> =
            batchReadMemberships(
                ListBatchReadMembershipsParams.builder()
                    .batchInputRecordIdInput(batchInputRecordIdInput)
                    .build(),
                requestOptions,
            )

        /** @see batchReadMemberships */
        @MustBeClosed
        fun batchReadMemberships(
            batchInputRecordIdInput: BatchInputRecordIdInput
        ): HttpResponseFor<BatchResponseRecordIdWithMemberships> =
            batchReadMemberships(batchInputRecordIdInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03/folders`, but is otherwise the
         * same as [ListService.createFolder].
         */
        @MustBeClosed
        fun createFolder(
            params: ListCreateFolderParams
        ): HttpResponseFor<ListFolderCreateResponse> = createFolder(params, RequestOptions.none())

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(
            params: ListCreateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderCreateResponse>

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(
            listFolderCreateRequest: ListFolderCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderCreateResponse> =
            createFolder(
                ListCreateFolderParams.builder()
                    .listFolderCreateRequest(listFolderCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(
            listFolderCreateRequest: ListFolderCreateRequest
        ): HttpResponseFor<ListFolderCreateResponse> =
            createFolder(listFolderCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03/idmapping`, but is otherwise the
         * same as [ListService.createIdMapping].
         */
        @MustBeClosed
        fun createIdMapping(
            params: ListCreateIdMappingParams
        ): HttpResponseFor<PublicBatchMigrationMapping> =
            createIdMapping(params, RequestOptions.none())

        /** @see createIdMapping */
        @MustBeClosed
        fun createIdMapping(
            params: ListCreateIdMappingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBatchMigrationMapping>

        /** @see createIdMapping */
        @MustBeClosed
        fun createIdMapping(
            body: List<String>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicBatchMigrationMapping> =
            createIdMapping(ListCreateIdMappingParams.builder().body(body).build(), requestOptions)

        /** @see createIdMapping */
        @MustBeClosed
        fun createIdMapping(body: List<String>): HttpResponseFor<PublicBatchMigrationMapping> =
            createIdMapping(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /crm/lists/2026-03/folders/{folderId}`, but is
         * otherwise the same as [ListService.deleteFolder].
         */
        @MustBeClosed
        fun deleteFolder(folderId: String): HttpResponse =
            deleteFolder(folderId, ListDeleteFolderParams.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            folderId: String,
            params: ListDeleteFolderParams = ListDeleteFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteFolder(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            folderId: String,
            params: ListDeleteFolderParams = ListDeleteFolderParams.none(),
        ): HttpResponse = deleteFolder(folderId, params, RequestOptions.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            params: ListDeleteFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(params: ListDeleteFolderParams): HttpResponse =
            deleteFolder(params, RequestOptions.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(folderId: String, requestOptions: RequestOptions): HttpResponse =
            deleteFolder(folderId, ListDeleteFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/lists/2026-03/{listId}/memberships`, but is
         * otherwise the same as [ListService.deleteMemberships].
         */
        @MustBeClosed
        fun deleteMemberships(listId: String): HttpResponse =
            deleteMemberships(listId, ListDeleteMembershipsParams.none())

        /** @see deleteMemberships */
        @MustBeClosed
        fun deleteMemberships(
            listId: String,
            params: ListDeleteMembershipsParams = ListDeleteMembershipsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see deleteMemberships */
        @MustBeClosed
        fun deleteMemberships(
            listId: String,
            params: ListDeleteMembershipsParams = ListDeleteMembershipsParams.none(),
        ): HttpResponse = deleteMemberships(listId, params, RequestOptions.none())

        /** @see deleteMemberships */
        @MustBeClosed
        fun deleteMemberships(
            params: ListDeleteMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteMemberships */
        @MustBeClosed
        fun deleteMemberships(params: ListDeleteMembershipsParams): HttpResponse =
            deleteMemberships(params, RequestOptions.none())

        /** @see deleteMemberships */
        @MustBeClosed
        fun deleteMemberships(listId: String, requestOptions: RequestOptions): HttpResponse =
            deleteMemberships(listId, ListDeleteMembershipsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/{listId}`, but is otherwise the
         * same as [ListService.get].
         */
        @MustBeClosed
        fun get(listId: String): HttpResponseFor<ListFetchResponse> =
            get(listId, ListGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            listId: String,
            params: ListGetParams = ListGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFetchResponse> =
            get(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            listId: String,
            params: ListGetParams = ListGetParams.none(),
        ): HttpResponseFor<ListFetchResponse> = get(listId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ListGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFetchResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ListGetParams): HttpResponseFor<ListFetchResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFetchResponse> = get(listId, ListGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/lists/2026-03/object-type-id/{objectTypeId}/name/{listName}`, but is otherwise the
         * same as [ListService.getByObjectTypeAndName].
         */
        @MustBeClosed
        fun getByObjectTypeAndName(
            listName: String,
            params: ListGetByObjectTypeAndNameParams,
        ): HttpResponseFor<ListFetchResponse> =
            getByObjectTypeAndName(listName, params, RequestOptions.none())

        /** @see getByObjectTypeAndName */
        @MustBeClosed
        fun getByObjectTypeAndName(
            listName: String,
            params: ListGetByObjectTypeAndNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFetchResponse> =
            getByObjectTypeAndName(params.toBuilder().listName(listName).build(), requestOptions)

        /** @see getByObjectTypeAndName */
        @MustBeClosed
        fun getByObjectTypeAndName(
            params: ListGetByObjectTypeAndNameParams
        ): HttpResponseFor<ListFetchResponse> =
            getByObjectTypeAndName(params, RequestOptions.none())

        /** @see getByObjectTypeAndName */
        @MustBeClosed
        fun getByObjectTypeAndName(
            params: ListGetByObjectTypeAndNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFetchResponse>

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/idmapping`, but is otherwise the
         * same as [ListService.getIdMapping].
         */
        @MustBeClosed
        fun getIdMapping(): HttpResponseFor<PublicMigrationMapping> =
            getIdMapping(ListGetIdMappingParams.none())

        /** @see getIdMapping */
        @MustBeClosed
        fun getIdMapping(
            params: ListGetIdMappingParams = ListGetIdMappingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicMigrationMapping>

        /** @see getIdMapping */
        @MustBeClosed
        fun getIdMapping(
            params: ListGetIdMappingParams = ListGetIdMappingParams.none()
        ): HttpResponseFor<PublicMigrationMapping> = getIdMapping(params, RequestOptions.none())

        /** @see getIdMapping */
        @MustBeClosed
        fun getIdMapping(requestOptions: RequestOptions): HttpResponseFor<PublicMigrationMapping> =
            getIdMapping(ListGetIdMappingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/{listId}/memberships/join-order`,
         * but is otherwise the same as [ListService.getMembershipsJoinOrder].
         */
        @MustBeClosed
        fun getMembershipsJoinOrder(
            listId: String
        ): HttpResponseFor<ListGetMembershipsJoinOrderPage> =
            getMembershipsJoinOrder(listId, ListGetMembershipsJoinOrderParams.none())

        /** @see getMembershipsJoinOrder */
        @MustBeClosed
        fun getMembershipsJoinOrder(
            listId: String,
            params: ListGetMembershipsJoinOrderParams = ListGetMembershipsJoinOrderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListGetMembershipsJoinOrderPage> =
            getMembershipsJoinOrder(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see getMembershipsJoinOrder */
        @MustBeClosed
        fun getMembershipsJoinOrder(
            listId: String,
            params: ListGetMembershipsJoinOrderParams = ListGetMembershipsJoinOrderParams.none(),
        ): HttpResponseFor<ListGetMembershipsJoinOrderPage> =
            getMembershipsJoinOrder(listId, params, RequestOptions.none())

        /** @see getMembershipsJoinOrder */
        @MustBeClosed
        fun getMembershipsJoinOrder(
            params: ListGetMembershipsJoinOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListGetMembershipsJoinOrderPage>

        /** @see getMembershipsJoinOrder */
        @MustBeClosed
        fun getMembershipsJoinOrder(
            params: ListGetMembershipsJoinOrderParams
        ): HttpResponseFor<ListGetMembershipsJoinOrderPage> =
            getMembershipsJoinOrder(params, RequestOptions.none())

        /** @see getMembershipsJoinOrder */
        @MustBeClosed
        fun getMembershipsJoinOrder(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListGetMembershipsJoinOrderPage> =
            getMembershipsJoinOrder(
                listId,
                ListGetMembershipsJoinOrderParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /crm/lists/2026-03/records/{objectTypeId}/{recordId}/memberships`, but is otherwise the
         * same as [ListService.getRecordMemberships].
         */
        @MustBeClosed
        fun getRecordMemberships(
            recordId: String,
            params: ListGetRecordMembershipsParams,
        ): HttpResponseFor<ApiCollectionResponseRecordListMembership> =
            getRecordMemberships(recordId, params, RequestOptions.none())

        /** @see getRecordMemberships */
        @MustBeClosed
        fun getRecordMemberships(
            recordId: String,
            params: ListGetRecordMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiCollectionResponseRecordListMembership> =
            getRecordMemberships(params.toBuilder().recordId(recordId).build(), requestOptions)

        /** @see getRecordMemberships */
        @MustBeClosed
        fun getRecordMemberships(
            params: ListGetRecordMembershipsParams
        ): HttpResponseFor<ApiCollectionResponseRecordListMembership> =
            getRecordMemberships(params, RequestOptions.none())

        /** @see getRecordMemberships */
        @MustBeClosed
        fun getRecordMemberships(
            params: ListGetRecordMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiCollectionResponseRecordListMembership>

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/{listId}/schedule-conversion`,
         * but is otherwise the same as [ListService.getScheduleConversion].
         */
        @MustBeClosed
        fun getScheduleConversion(listId: String): HttpResponseFor<PublicListConversionResponse> =
            getScheduleConversion(listId, ListGetScheduleConversionParams.none())

        /** @see getScheduleConversion */
        @MustBeClosed
        fun getScheduleConversion(
            listId: String,
            params: ListGetScheduleConversionParams = ListGetScheduleConversionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicListConversionResponse> =
            getScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see getScheduleConversion */
        @MustBeClosed
        fun getScheduleConversion(
            listId: String,
            params: ListGetScheduleConversionParams = ListGetScheduleConversionParams.none(),
        ): HttpResponseFor<PublicListConversionResponse> =
            getScheduleConversion(listId, params, RequestOptions.none())

        /** @see getScheduleConversion */
        @MustBeClosed
        fun getScheduleConversion(
            params: ListGetScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicListConversionResponse>

        /** @see getScheduleConversion */
        @MustBeClosed
        fun getScheduleConversion(
            params: ListGetScheduleConversionParams
        ): HttpResponseFor<PublicListConversionResponse> =
            getScheduleConversion(params, RequestOptions.none())

        /** @see getScheduleConversion */
        @MustBeClosed
        fun getScheduleConversion(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicListConversionResponse> =
            getScheduleConversion(listId, ListGetScheduleConversionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/lists/2026-03/{listId}/size-and-edits-history/between`, but is otherwise the same as
         * [ListService.getSizeAndEditsHistoryBetween].
         */
        @MustBeClosed
        fun getSizeAndEditsHistoryBetween(
            listId: String
        ): HttpResponseFor<ListSizeAndEditHistoryResponse> =
            getSizeAndEditsHistoryBetween(listId, ListGetSizeAndEditsHistoryBetweenParams.none())

        /** @see getSizeAndEditsHistoryBetween */
        @MustBeClosed
        fun getSizeAndEditsHistoryBetween(
            listId: String,
            params: ListGetSizeAndEditsHistoryBetweenParams =
                ListGetSizeAndEditsHistoryBetweenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListSizeAndEditHistoryResponse> =
            getSizeAndEditsHistoryBetween(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see getSizeAndEditsHistoryBetween */
        @MustBeClosed
        fun getSizeAndEditsHistoryBetween(
            listId: String,
            params: ListGetSizeAndEditsHistoryBetweenParams =
                ListGetSizeAndEditsHistoryBetweenParams.none(),
        ): HttpResponseFor<ListSizeAndEditHistoryResponse> =
            getSizeAndEditsHistoryBetween(listId, params, RequestOptions.none())

        /** @see getSizeAndEditsHistoryBetween */
        @MustBeClosed
        fun getSizeAndEditsHistoryBetween(
            params: ListGetSizeAndEditsHistoryBetweenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListSizeAndEditHistoryResponse>

        /** @see getSizeAndEditsHistoryBetween */
        @MustBeClosed
        fun getSizeAndEditsHistoryBetween(
            params: ListGetSizeAndEditsHistoryBetweenParams
        ): HttpResponseFor<ListSizeAndEditHistoryResponse> =
            getSizeAndEditsHistoryBetween(params, RequestOptions.none())

        /** @see getSizeAndEditsHistoryBetween */
        @MustBeClosed
        fun getSizeAndEditsHistoryBetween(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListSizeAndEditHistoryResponse> =
            getSizeAndEditsHistoryBetween(
                listId,
                ListGetSizeAndEditsHistoryBetweenParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /crm/lists/2026-03/search`, but is otherwise the
         * same as [ListService.listBySearch].
         */
        @MustBeClosed
        fun listBySearch(params: ListListBySearchParams): HttpResponseFor<ListSearchResponse> =
            listBySearch(params, RequestOptions.none())

        /** @see listBySearch */
        @MustBeClosed
        fun listBySearch(
            params: ListListBySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListSearchResponse>

        /** @see listBySearch */
        @MustBeClosed
        fun listBySearch(
            listSearchRequest: ListSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListSearchResponse> =
            listBySearch(
                ListListBySearchParams.builder().listSearchRequest(listSearchRequest).build(),
                requestOptions,
            )

        /** @see listBySearch */
        @MustBeClosed
        fun listBySearch(
            listSearchRequest: ListSearchRequest
        ): HttpResponseFor<ListSearchResponse> =
            listBySearch(listSearchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/folders`, but is otherwise the
         * same as [ListService.listFolders].
         */
        @MustBeClosed
        fun listFolders(): HttpResponseFor<ListFolderFetchResponse> =
            listFolders(ListListFoldersParams.none())

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(
            params: ListListFoldersParams = ListListFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse>

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(
            params: ListListFoldersParams = ListListFoldersParams.none()
        ): HttpResponseFor<ListFolderFetchResponse> = listFolders(params, RequestOptions.none())

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(requestOptions: RequestOptions): HttpResponseFor<ListFolderFetchResponse> =
            listFolders(ListListFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/lists/2026-03/{listId}/memberships`, but is
         * otherwise the same as [ListService.listMemberships].
         */
        @MustBeClosed
        fun listMemberships(listId: String): HttpResponseFor<ListListMembershipsPage> =
            listMemberships(listId, ListListMembershipsParams.none())

        /** @see listMemberships */
        @MustBeClosed
        fun listMemberships(
            listId: String,
            params: ListListMembershipsParams = ListListMembershipsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListListMembershipsPage> =
            listMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see listMemberships */
        @MustBeClosed
        fun listMemberships(
            listId: String,
            params: ListListMembershipsParams = ListListMembershipsParams.none(),
        ): HttpResponseFor<ListListMembershipsPage> =
            listMemberships(listId, params, RequestOptions.none())

        /** @see listMemberships */
        @MustBeClosed
        fun listMemberships(
            params: ListListMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListListMembershipsPage>

        /** @see listMemberships */
        @MustBeClosed
        fun listMemberships(
            params: ListListMembershipsParams
        ): HttpResponseFor<ListListMembershipsPage> = listMemberships(params, RequestOptions.none())

        /** @see listMemberships */
        @MustBeClosed
        fun listMemberships(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListListMembershipsPage> =
            listMemberships(listId, ListListMembershipsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /crm/lists/2026-03/folders/{folderId}/move/{newParentFolderId}`, but is otherwise the
         * same as [ListService.moveFolder].
         */
        @MustBeClosed
        fun moveFolder(
            newParentFolderId: String,
            params: ListMoveFolderParams,
        ): HttpResponseFor<ListFolderFetchResponse> =
            moveFolder(newParentFolderId, params, RequestOptions.none())

        /** @see moveFolder */
        @MustBeClosed
        fun moveFolder(
            newParentFolderId: String,
            params: ListMoveFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse> =
            moveFolder(
                params.toBuilder().newParentFolderId(newParentFolderId).build(),
                requestOptions,
            )

        /** @see moveFolder */
        @MustBeClosed
        fun moveFolder(params: ListMoveFolderParams): HttpResponseFor<ListFolderFetchResponse> =
            moveFolder(params, RequestOptions.none())

        /** @see moveFolder */
        @MustBeClosed
        fun moveFolder(
            params: ListMoveFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse>

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/folders/move-list`, but is
         * otherwise the same as [ListService.moveList].
         */
        @MustBeClosed
        fun moveList(params: ListMoveListParams): HttpResponse =
            moveList(params, RequestOptions.none())

        /** @see moveList */
        @MustBeClosed
        fun moveList(
            params: ListMoveListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see moveList */
        @MustBeClosed
        fun moveList(
            listMoveRequest: ListMoveRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            moveList(
                ListMoveListParams.builder().listMoveRequest(listMoveRequest).build(),
                requestOptions,
            )

        /** @see moveList */
        @MustBeClosed
        fun moveList(listMoveRequest: ListMoveRequest): HttpResponse =
            moveList(listMoveRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/memberships/remove`, but
         * is otherwise the same as [ListService.removeMemberships].
         */
        @MustBeClosed
        fun removeMemberships(
            listId: String,
            params: ListRemoveMembershipsParams,
        ): HttpResponseFor<MembershipsUpdateResponse> =
            removeMemberships(listId, params, RequestOptions.none())

        /** @see removeMemberships */
        @MustBeClosed
        fun removeMemberships(
            listId: String,
            params: ListRemoveMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse> =
            removeMemberships(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see removeMemberships */
        @MustBeClosed
        fun removeMemberships(
            params: ListRemoveMembershipsParams
        ): HttpResponseFor<MembershipsUpdateResponse> =
            removeMemberships(params, RequestOptions.none())

        /** @see removeMemberships */
        @MustBeClosed
        fun removeMemberships(
            params: ListRemoveMembershipsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse>

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/folders/{folderId}/rename`, but
         * is otherwise the same as [ListService.renameFolder].
         */
        @MustBeClosed
        fun renameFolder(folderId: String): HttpResponseFor<ListFolderFetchResponse> =
            renameFolder(folderId, ListRenameFolderParams.none())

        /** @see renameFolder */
        @MustBeClosed
        fun renameFolder(
            folderId: String,
            params: ListRenameFolderParams = ListRenameFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse> =
            renameFolder(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see renameFolder */
        @MustBeClosed
        fun renameFolder(
            folderId: String,
            params: ListRenameFolderParams = ListRenameFolderParams.none(),
        ): HttpResponseFor<ListFolderFetchResponse> =
            renameFolder(folderId, params, RequestOptions.none())

        /** @see renameFolder */
        @MustBeClosed
        fun renameFolder(
            params: ListRenameFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse>

        /** @see renameFolder */
        @MustBeClosed
        fun renameFolder(params: ListRenameFolderParams): HttpResponseFor<ListFolderFetchResponse> =
            renameFolder(params, RequestOptions.none())

        /** @see renameFolder */
        @MustBeClosed
        fun renameFolder(
            folderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFolderFetchResponse> =
            renameFolder(folderId, ListRenameFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/restore`, but is
         * otherwise the same as [ListService.restore].
         */
        @MustBeClosed
        fun restore(listId: String): HttpResponse = restore(listId, ListRestoreParams.none())

        /** @see restore */
        @MustBeClosed
        fun restore(
            listId: String,
            params: ListRestoreParams = ListRestoreParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = restore(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see restore */
        @MustBeClosed
        fun restore(
            listId: String,
            params: ListRestoreParams = ListRestoreParams.none(),
        ): HttpResponse = restore(listId, params, RequestOptions.none())

        /** @see restore */
        @MustBeClosed
        fun restore(
            params: ListRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see restore */
        @MustBeClosed
        fun restore(params: ListRestoreParams): HttpResponse =
            restore(params, RequestOptions.none())

        /** @see restore */
        @MustBeClosed
        fun restore(listId: String, requestOptions: RequestOptions): HttpResponse =
            restore(listId, ListRestoreParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/lists/2026-03/{listId}/schedule-conversion`,
         * but is otherwise the same as [ListService.scheduleConversion].
         */
        @MustBeClosed
        fun scheduleConversion(listId: String): HttpResponse =
            scheduleConversion(listId, ListScheduleConversionParams.none())

        /** @see scheduleConversion */
        @MustBeClosed
        fun scheduleConversion(
            listId: String,
            params: ListScheduleConversionParams = ListScheduleConversionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            scheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see scheduleConversion */
        @MustBeClosed
        fun scheduleConversion(
            listId: String,
            params: ListScheduleConversionParams = ListScheduleConversionParams.none(),
        ): HttpResponse = scheduleConversion(listId, params, RequestOptions.none())

        /** @see scheduleConversion */
        @MustBeClosed
        fun scheduleConversion(
            params: ListScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see scheduleConversion */
        @MustBeClosed
        fun scheduleConversion(params: ListScheduleConversionParams): HttpResponse =
            scheduleConversion(params, RequestOptions.none())

        /** @see scheduleConversion */
        @MustBeClosed
        fun scheduleConversion(listId: String, requestOptions: RequestOptions): HttpResponse =
            scheduleConversion(listId, ListScheduleConversionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/update-list-filters`,
         * but is otherwise the same as [ListService.updateListFilters].
         */
        @MustBeClosed
        fun updateListFilters(
            listId: String,
            params: ListUpdateListFiltersParams,
        ): HttpResponseFor<ListUpdateResponse> =
            updateListFilters(listId, params, RequestOptions.none())

        /** @see updateListFilters */
        @MustBeClosed
        fun updateListFilters(
            listId: String,
            params: ListUpdateListFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListUpdateResponse> =
            updateListFilters(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateListFilters */
        @MustBeClosed
        fun updateListFilters(
            params: ListUpdateListFiltersParams
        ): HttpResponseFor<ListUpdateResponse> = updateListFilters(params, RequestOptions.none())

        /** @see updateListFilters */
        @MustBeClosed
        fun updateListFilters(
            params: ListUpdateListFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListUpdateResponse>

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/update-list-name`, but
         * is otherwise the same as [ListService.updateListName].
         */
        @MustBeClosed
        fun updateListName(listId: String): HttpResponseFor<ListUpdateResponse> =
            updateListName(listId, ListUpdateListNameParams.none())

        /** @see updateListName */
        @MustBeClosed
        fun updateListName(
            listId: String,
            params: ListUpdateListNameParams = ListUpdateListNameParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListUpdateResponse> =
            updateListName(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateListName */
        @MustBeClosed
        fun updateListName(
            listId: String,
            params: ListUpdateListNameParams = ListUpdateListNameParams.none(),
        ): HttpResponseFor<ListUpdateResponse> =
            updateListName(listId, params, RequestOptions.none())

        /** @see updateListName */
        @MustBeClosed
        fun updateListName(
            params: ListUpdateListNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListUpdateResponse>

        /** @see updateListName */
        @MustBeClosed
        fun updateListName(params: ListUpdateListNameParams): HttpResponseFor<ListUpdateResponse> =
            updateListName(params, RequestOptions.none())

        /** @see updateListName */
        @MustBeClosed
        fun updateListName(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListUpdateResponse> =
            updateListName(listId, ListUpdateListNameParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /crm/lists/2026-03/{listId}/schedule-conversion`,
         * but is otherwise the same as [ListService.updateScheduleConversion].
         */
        @MustBeClosed
        fun updateScheduleConversion(
            listId: String,
            params: ListUpdateScheduleConversionParams,
        ): HttpResponseFor<PublicListConversionResponse> =
            updateScheduleConversion(listId, params, RequestOptions.none())

        /** @see updateScheduleConversion */
        @MustBeClosed
        fun updateScheduleConversion(
            listId: String,
            params: ListUpdateScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicListConversionResponse> =
            updateScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateScheduleConversion */
        @MustBeClosed
        fun updateScheduleConversion(
            params: ListUpdateScheduleConversionParams
        ): HttpResponseFor<PublicListConversionResponse> =
            updateScheduleConversion(params, RequestOptions.none())

        /** @see updateScheduleConversion */
        @MustBeClosed
        fun updateScheduleConversion(
            params: ListUpdateScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicListConversionResponse>
    }
}
