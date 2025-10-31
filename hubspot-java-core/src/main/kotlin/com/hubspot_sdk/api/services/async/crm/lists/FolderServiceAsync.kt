// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.lists

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FolderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderServiceAsync

    /** Creates a folder with the given information. */
    fun create(params: FolderCreateParams): CompletableFuture<ListFolderCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderCreateResponse>

    /** @see create */
    fun create(
        listFolderCreateRequest: ListFolderCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderCreateResponse> =
        create(
            FolderCreateParams.builder().listFolderCreateRequest(listFolderCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        listFolderCreateRequest: ListFolderCreateRequest
    ): CompletableFuture<ListFolderCreateResponse> =
        create(listFolderCreateRequest, RequestOptions.none())

    /** Deletes the folder with the given Id. */
    fun delete(folderId: String): CompletableFuture<Void?> =
        delete(folderId, FolderDeleteParams.none())

    /** @see delete */
    fun delete(
        folderId: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see delete */
    fun delete(
        folderId: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(folderId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FolderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FolderDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(folderId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(folderId, FolderDeleteParams.none(), requestOptions)

    /**
     * Retrieves a folder and recursively includes all folders via the childNodes attribute. The
     * child lists field will be empty in all child nodes. Only the folder retrieved will include
     * the child lists in that folder.
     */
    fun get(): CompletableFuture<ListFolderFetchResponse> = get(FolderGetParams.none())

    /** @see get */
    fun get(
        params: FolderGetParams = FolderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse>

    /** @see get */
    fun get(
        params: FolderGetParams = FolderGetParams.none()
    ): CompletableFuture<ListFolderFetchResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<ListFolderFetchResponse> =
        get(FolderGetParams.none(), requestOptions)

    /**
     * This moves the folder from its current location to a new location. It updates the parent of
     * this folder to the new Id given.
     */
    fun move(
        newParentFolderId: String,
        params: FolderMoveParams,
    ): CompletableFuture<ListFolderFetchResponse> =
        move(newParentFolderId, params, RequestOptions.none())

    /** @see move */
    fun move(
        newParentFolderId: String,
        params: FolderMoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse> =
        move(params.toBuilder().newParentFolderId(newParentFolderId).build(), requestOptions)

    /** @see move */
    fun move(params: FolderMoveParams): CompletableFuture<ListFolderFetchResponse> =
        move(params, RequestOptions.none())

    /** @see move */
    fun move(
        params: FolderMoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse>

    /** Given a list and a folder, the list will be moved to that folder. */
    fun moveList(params: FolderMoveListParams): CompletableFuture<Void?> =
        moveList(params, RequestOptions.none())

    /** @see moveList */
    fun moveList(
        params: FolderMoveListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see moveList */
    fun moveList(
        listMoveRequest: ListMoveRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        moveList(
            FolderMoveListParams.builder().listMoveRequest(listMoveRequest).build(),
            requestOptions,
        )

    /** @see moveList */
    fun moveList(listMoveRequest: ListMoveRequest): CompletableFuture<Void?> =
        moveList(listMoveRequest, RequestOptions.none())

    /** Renames the given folderId with a new name. */
    fun rename(folderId: String): CompletableFuture<ListFolderFetchResponse> =
        rename(folderId, FolderRenameParams.none())

    /** @see rename */
    fun rename(
        folderId: String,
        params: FolderRenameParams = FolderRenameParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse> =
        rename(params.toBuilder().folderId(folderId).build(), requestOptions)

    /** @see rename */
    fun rename(
        folderId: String,
        params: FolderRenameParams = FolderRenameParams.none(),
    ): CompletableFuture<ListFolderFetchResponse> = rename(folderId, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFolderFetchResponse>

    /** @see rename */
    fun rename(params: FolderRenameParams): CompletableFuture<ListFolderFetchResponse> =
        rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        folderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderFetchResponse> =
        rename(folderId, FolderRenameParams.none(), requestOptions)

    /**
     * A view of [FolderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FolderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/lists/folders`, but is otherwise the same
         * as [FolderServiceAsync.create].
         */
        fun create(
            params: FolderCreateParams
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>>

        /** @see create */
        fun create(
            listFolderCreateRequest: ListFolderCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>> =
            create(
                FolderCreateParams.builder()
                    .listFolderCreateRequest(listFolderCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            listFolderCreateRequest: ListFolderCreateRequest
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>> =
            create(listFolderCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /crm/v3/lists/folders/{folderId}`, but is
         * otherwise the same as [FolderServiceAsync.delete].
         */
        fun delete(folderId: String): CompletableFuture<HttpResponse> =
            delete(folderId, FolderDeleteParams.none())

        /** @see delete */
        fun delete(
            folderId: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see delete */
        fun delete(
            folderId: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(folderId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FolderDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            folderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(folderId, FolderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/folders`, but is otherwise the same as
         * [FolderServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            get(FolderGetParams.none())

        /** @see get */
        fun get(
            params: FolderGetParams = FolderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>>

        /** @see get */
        fun get(
            params: FolderGetParams = FolderGetParams.none()
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            get(FolderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/lists/folders/{folderId}/move/{newParentFolderId}`, but is otherwise the same as
         * [FolderServiceAsync.move].
         */
        fun move(
            newParentFolderId: String,
            params: FolderMoveParams,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            move(newParentFolderId, params, RequestOptions.none())

        /** @see move */
        fun move(
            newParentFolderId: String,
            params: FolderMoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            move(params.toBuilder().newParentFolderId(newParentFolderId).build(), requestOptions)

        /** @see move */
        fun move(
            params: FolderMoveParams
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            move(params, RequestOptions.none())

        /** @see move */
        fun move(
            params: FolderMoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>>

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/folders/move-list`, but is otherwise
         * the same as [FolderServiceAsync.moveList].
         */
        fun moveList(params: FolderMoveListParams): CompletableFuture<HttpResponse> =
            moveList(params, RequestOptions.none())

        /** @see moveList */
        fun moveList(
            params: FolderMoveListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see moveList */
        fun moveList(
            listMoveRequest: ListMoveRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            moveList(
                FolderMoveListParams.builder().listMoveRequest(listMoveRequest).build(),
                requestOptions,
            )

        /** @see moveList */
        fun moveList(listMoveRequest: ListMoveRequest): CompletableFuture<HttpResponse> =
            moveList(listMoveRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/folders/{folderId}/rename`, but is
         * otherwise the same as [FolderServiceAsync.rename].
         */
        fun rename(folderId: String): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            rename(folderId, FolderRenameParams.none())

        /** @see rename */
        fun rename(
            folderId: String,
            params: FolderRenameParams = FolderRenameParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            rename(params.toBuilder().folderId(folderId).build(), requestOptions)

        /** @see rename */
        fun rename(
            folderId: String,
            params: FolderRenameParams = FolderRenameParams.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            rename(folderId, params, RequestOptions.none())

        /** @see rename */
        fun rename(
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>>

        /** @see rename */
        fun rename(
            params: FolderRenameParams
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            rename(params, RequestOptions.none())

        /** @see rename */
        fun rename(
            folderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> =
            rename(folderId, FolderRenameParams.none(), requestOptions)
    }
}
