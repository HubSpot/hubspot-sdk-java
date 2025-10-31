// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.lists

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.lists.ListFolderCreateRequest
import com.hubspot_sdk.api.models.crm.lists.ListFolderCreateResponse
import com.hubspot_sdk.api.models.crm.lists.ListFolderFetchResponse
import com.hubspot_sdk.api.models.crm.lists.ListMoveRequest
import com.hubspot_sdk.api.models.crm.lists.folders.FolderCreateParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderDeleteParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderGetParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderMoveListParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderMoveParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderRenameParams
import java.util.function.Consumer

interface FolderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService

    /** Creates a folder with the given information. */
    fun create(params: FolderCreateParams): ListFolderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderCreateResponse

    /** @see create */
    fun create(
        listFolderCreateRequest: ListFolderCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderCreateResponse =
        create(
            FolderCreateParams.builder().listFolderCreateRequest(listFolderCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(listFolderCreateRequest: ListFolderCreateRequest): ListFolderCreateResponse =
        create(listFolderCreateRequest, RequestOptions.none())

    /** Deletes the folder with the given Id. */
    fun delete(folderId: String) = delete(folderId, FolderDeleteParams.none())

    /** @see delete */
    fun delete(
        folderId: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see delete */
    fun delete(folderId: String, params: FolderDeleteParams = FolderDeleteParams.none()) =
        delete(folderId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FolderDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FolderDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(folderId: String, requestOptions: RequestOptions) =
        delete(folderId, FolderDeleteParams.none(), requestOptions)

    /**
     * Retrieves a folder and recursively includes all folders via the childNodes attribute. The
     * child lists field will be empty in all child nodes. Only the folder retrieved will include
     * the child lists in that folder.
     */
    fun get(): ListFolderFetchResponse = get(FolderGetParams.none())

    /** @see get */
    fun get(
        params: FolderGetParams = FolderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse

    /** @see get */
    fun get(params: FolderGetParams = FolderGetParams.none()): ListFolderFetchResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): ListFolderFetchResponse =
        get(FolderGetParams.none(), requestOptions)

    /**
     * This moves the folder from its current location to a new location. It updates the parent of
     * this folder to the new Id given.
     */
    fun move(newParentFolderId: String, params: FolderMoveParams): ListFolderFetchResponse =
        move(newParentFolderId, params, RequestOptions.none())

    /** @see move */
    fun move(
        newParentFolderId: String,
        params: FolderMoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse =
        move(params.toBuilder().newParentFolderId(newParentFolderId).build(), requestOptions)

    /** @see move */
    fun move(params: FolderMoveParams): ListFolderFetchResponse =
        move(params, RequestOptions.none())

    /** @see move */
    fun move(
        params: FolderMoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse

    /** Given a list and a folder, the list will be moved to that folder. */
    fun moveList(params: FolderMoveListParams) = moveList(params, RequestOptions.none())

    /** @see moveList */
    fun moveList(
        params: FolderMoveListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see moveList */
    fun moveList(
        listMoveRequest: ListMoveRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        moveList(
            FolderMoveListParams.builder().listMoveRequest(listMoveRequest).build(),
            requestOptions,
        )

    /** @see moveList */
    fun moveList(listMoveRequest: ListMoveRequest) =
        moveList(listMoveRequest, RequestOptions.none())

    /** Renames the given folderId with a new name. */
    fun rename(folderId: String): ListFolderFetchResponse =
        rename(folderId, FolderRenameParams.none())

    /** @see rename */
    fun rename(
        folderId: String,
        params: FolderRenameParams = FolderRenameParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse =
        rename(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see rename */
    fun rename(
        folderId: String,
        params: FolderRenameParams = FolderRenameParams.none(),
    ): ListFolderFetchResponse = rename(folderId, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFolderFetchResponse

    /** @see rename */
    fun rename(params: FolderRenameParams): ListFolderFetchResponse =
        rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(folderId: String, requestOptions: RequestOptions): ListFolderFetchResponse =
        rename(folderId, FolderRenameParams.none(), requestOptions)

    /** A view of [FolderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/lists/folders`, but is otherwise the same
         * as [FolderService.create].
         */
        @MustBeClosed
        fun create(params: FolderCreateParams): HttpResponseFor<ListFolderCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            listFolderCreateRequest: ListFolderCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderCreateResponse> =
            create(
                FolderCreateParams.builder()
                    .listFolderCreateRequest(listFolderCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            listFolderCreateRequest: ListFolderCreateRequest
        ): HttpResponseFor<ListFolderCreateResponse> =
            create(listFolderCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /crm/v3/lists/folders/{folderId}`, but is
         * otherwise the same as [FolderService.delete].
         */
        @MustBeClosed
        fun delete(folderId: String): HttpResponse = delete(folderId, FolderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            folderId: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            folderId: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
        ): HttpResponse = delete(folderId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FolderDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(folderId: String, requestOptions: RequestOptions): HttpResponse =
            delete(folderId, FolderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/folders`, but is otherwise the same as
         * [FolderService.get].
         */
        @MustBeClosed
        fun get(): HttpResponseFor<ListFolderFetchResponse> = get(FolderGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FolderGetParams = FolderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: FolderGetParams = FolderGetParams.none()
        ): HttpResponseFor<ListFolderFetchResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<ListFolderFetchResponse> =
            get(FolderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/lists/folders/{folderId}/move/{newParentFolderId}`, but is otherwise the same as
         * [FolderService.move].
         */
        @MustBeClosed
        fun move(
            newParentFolderId: String,
            params: FolderMoveParams,
        ): HttpResponseFor<ListFolderFetchResponse> =
            move(newParentFolderId, params, RequestOptions.none())

        /** @see move */
        @MustBeClosed
        fun move(
            newParentFolderId: String,
            params: FolderMoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse> =
            move(params.toBuilder().newParentFolderId(newParentFolderId).build(), requestOptions)

        /** @see move */
        @MustBeClosed
        fun move(params: FolderMoveParams): HttpResponseFor<ListFolderFetchResponse> =
            move(params, RequestOptions.none())

        /** @see move */
        @MustBeClosed
        fun move(
            params: FolderMoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse>

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/folders/move-list`, but is otherwise
         * the same as [FolderService.moveList].
         */
        @MustBeClosed
        fun moveList(params: FolderMoveListParams): HttpResponse =
            moveList(params, RequestOptions.none())

        /** @see moveList */
        @MustBeClosed
        fun moveList(
            params: FolderMoveListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see moveList */
        @MustBeClosed
        fun moveList(
            listMoveRequest: ListMoveRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            moveList(
                FolderMoveListParams.builder().listMoveRequest(listMoveRequest).build(),
                requestOptions,
            )

        /** @see moveList */
        @MustBeClosed
        fun moveList(listMoveRequest: ListMoveRequest): HttpResponse =
            moveList(listMoveRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/folders/{folderId}/rename`, but is
         * otherwise the same as [FolderService.rename].
         */
        @MustBeClosed
        fun rename(folderId: String): HttpResponseFor<ListFolderFetchResponse> =
            rename(folderId, FolderRenameParams.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            folderId: String,
            params: FolderRenameParams = FolderRenameParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse> =
            rename(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see rename */
        @MustBeClosed
        fun rename(
            folderId: String,
            params: FolderRenameParams = FolderRenameParams.none(),
        ): HttpResponseFor<ListFolderFetchResponse> =
            rename(folderId, params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFolderFetchResponse>

        /** @see rename */
        @MustBeClosed
        fun rename(params: FolderRenameParams): HttpResponseFor<ListFolderFetchResponse> =
            rename(params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            folderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListFolderFetchResponse> =
            rename(folderId, FolderRenameParams.none(), requestOptions)
    }
}
