// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.lists

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.lists.ApiCollectionResponseRecordListMembershipNoPaging
import com.hubspot_sdk.api.models.crm.lists.MembershipsUpdateResponse
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddAllFromListParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddAndRemoveParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetListsParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetPageOrderedByAddedToListDatePageAsync
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetPageOrderedByAddedToListDateParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipListPageAsync
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipListParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipRemoveAllParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipRemoveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MembershipServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MembershipServiceAsync

    /**
     * Fetch the memberships of a list in order sorted by the `recordId` of the records in the list.
     *
     * The `recordId`s are sorted in *ascending* order if an `after` offset or no offset is
     * provided. If only a `before` offset is provided, then the records are sorted in *descending*
     * order.
     *
     * The `after` offset parameter will take precedence over the `before` offset in a case where
     * both are provided.
     */
    fun list(listId: String): CompletableFuture<MembershipListPageAsync> =
        list(listId, MembershipListParams.none())

    /** @see list */
    fun list(
        listId: String,
        params: MembershipListParams = MembershipListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipListPageAsync> =
        list(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see list */
    fun list(
        listId: String,
        params: MembershipListParams = MembershipListParams.none(),
    ): CompletableFuture<MembershipListPageAsync> = list(listId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MembershipListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipListPageAsync>

    /** @see list */
    fun list(params: MembershipListParams): CompletableFuture<MembershipListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipListPageAsync> =
        list(listId, MembershipListParams.none(), requestOptions)

    /**
     * Add the records provided to the list. Records that do not exist or that are already members
     * of the list are ignored.
     *
     * This endpoint only works for lists that have a `processingType` of `MANUAL` or `SNAPSHOT`.
     */
    fun add(
        listId: String,
        params: MembershipAddParams,
    ): CompletableFuture<MembershipsUpdateResponse> = add(listId, params, RequestOptions.none())

    /** @see add */
    fun add(
        listId: String,
        params: MembershipAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse> =
        add(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see add */
    fun add(params: MembershipAddParams): CompletableFuture<MembershipsUpdateResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: MembershipAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse>

    /**
     * Add all of the records from a *source list* (specified by the `sourceListId`) to a
     * *destination list* (specified by the `listId`). Records that are already members of the
     * *destination list* will be ignored. The *destination* and *source list* IDs must be
     * different. The *destination* and *source lists* must contain records of the same type (e.g.
     * contacts, companies, etc.).
     *
     * This endpoint only works for *destination lists* that have a `processingType` of `MANUAL` or
     * `SNAPSHOT`. The *source list* can have any `processingType`.
     *
     * This endpoint only supports a `sourceListId` for lists with less than 100,000 memberships.
     */
    fun addAllFromList(
        sourceListId: String,
        params: MembershipAddAllFromListParams,
    ): CompletableFuture<Void?> = addAllFromList(sourceListId, params, RequestOptions.none())

    /** @see addAllFromList */
    fun addAllFromList(
        sourceListId: String,
        params: MembershipAddAllFromListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        addAllFromList(params.toBuilder().sourceListId(sourceListId).build(), requestOptions)

    /** @see addAllFromList */
    fun addAllFromList(params: MembershipAddAllFromListParams): CompletableFuture<Void?> =
        addAllFromList(params, RequestOptions.none())

    /** @see addAllFromList */
    fun addAllFromList(
        params: MembershipAddAllFromListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Add and/or remove records that have already been created in the system to and/or from a list.
     *
     * This endpoint only works for lists that have a `processingType` of `MANUAL` or `SNAPSHOT`.
     */
    fun addAndRemove(
        listId: String,
        params: MembershipAddAndRemoveParams,
    ): CompletableFuture<MembershipsUpdateResponse> =
        addAndRemove(listId, params, RequestOptions.none())

    /** @see addAndRemove */
    fun addAndRemove(
        listId: String,
        params: MembershipAddAndRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse> =
        addAndRemove(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see addAndRemove */
    fun addAndRemove(
        params: MembershipAddAndRemoveParams
    ): CompletableFuture<MembershipsUpdateResponse> = addAndRemove(params, RequestOptions.none())

    /** @see addAndRemove */
    fun addAndRemove(
        params: MembershipAddAndRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse>

    /** For given record provide lists this record is member of. */
    fun getLists(
        recordId: String,
        params: MembershipGetListsParams,
    ): CompletableFuture<ApiCollectionResponseRecordListMembershipNoPaging> =
        getLists(recordId, params, RequestOptions.none())

    /** @see getLists */
    fun getLists(
        recordId: String,
        params: MembershipGetListsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiCollectionResponseRecordListMembershipNoPaging> =
        getLists(params.toBuilder().recordId(recordId).build(), requestOptions)

    /** @see getLists */
    fun getLists(
        params: MembershipGetListsParams
    ): CompletableFuture<ApiCollectionResponseRecordListMembershipNoPaging> =
        getLists(params, RequestOptions.none())

    /** @see getLists */
    fun getLists(
        params: MembershipGetListsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiCollectionResponseRecordListMembershipNoPaging>

    /**
     * Fetch the memberships of a list in order sorted by the time the records were added to the
     * list.
     *
     * The `recordId`s are sorted in *ascending* order if an `after` offset or no offset is
     * provided. If only a `before` offset is provided, then the records are sorted in *descending*
     * order.
     *
     * The `after` offset parameter will take precedence over the `before` offset in a case where
     * both are provided.
     */
    fun getPageOrderedByAddedToListDate(
        listId: String
    ): CompletableFuture<MembershipGetPageOrderedByAddedToListDatePageAsync> =
        getPageOrderedByAddedToListDate(
            listId,
            MembershipGetPageOrderedByAddedToListDateParams.none(),
        )

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        listId: String,
        params: MembershipGetPageOrderedByAddedToListDateParams =
            MembershipGetPageOrderedByAddedToListDateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipGetPageOrderedByAddedToListDatePageAsync> =
        getPageOrderedByAddedToListDate(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        listId: String,
        params: MembershipGetPageOrderedByAddedToListDateParams =
            MembershipGetPageOrderedByAddedToListDateParams.none(),
    ): CompletableFuture<MembershipGetPageOrderedByAddedToListDatePageAsync> =
        getPageOrderedByAddedToListDate(listId, params, RequestOptions.none())

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        params: MembershipGetPageOrderedByAddedToListDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipGetPageOrderedByAddedToListDatePageAsync>

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        params: MembershipGetPageOrderedByAddedToListDateParams
    ): CompletableFuture<MembershipGetPageOrderedByAddedToListDatePageAsync> =
        getPageOrderedByAddedToListDate(params, RequestOptions.none())

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipGetPageOrderedByAddedToListDatePageAsync> =
        getPageOrderedByAddedToListDate(
            listId,
            MembershipGetPageOrderedByAddedToListDateParams.none(),
            requestOptions,
        )

    /**
     * Remove the records provided from the list. Records that do not exist or that are not members
     * of the list are ignored.
     *
     * This endpoint only works for lists that have a `processingType` of `MANUAL` or `SNAPSHOT`.
     */
    fun remove(
        listId: String,
        params: MembershipRemoveParams,
    ): CompletableFuture<MembershipsUpdateResponse> = remove(listId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        listId: String,
        params: MembershipRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse> =
        remove(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see remove */
    fun remove(params: MembershipRemoveParams): CompletableFuture<MembershipsUpdateResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: MembershipRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MembershipsUpdateResponse>

    /**
     * Remove **all** of the records from a list. ***Note:*** *The list is not deleted.*
     *
     * This endpoint only works for lists that have a `processingType` of `MANUAL` or `SNAPSHOT`.
     *
     * This endpoint only supports lists that have less than 100,000 memberships.
     */
    fun removeAll(listId: String): CompletableFuture<Void?> =
        removeAll(listId, MembershipRemoveAllParams.none())

    /** @see removeAll */
    fun removeAll(
        listId: String,
        params: MembershipRemoveAllParams = MembershipRemoveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        removeAll(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see removeAll */
    fun removeAll(
        listId: String,
        params: MembershipRemoveAllParams = MembershipRemoveAllParams.none(),
    ): CompletableFuture<Void?> = removeAll(listId, params, RequestOptions.none())

    /** @see removeAll */
    fun removeAll(
        params: MembershipRemoveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see removeAll */
    fun removeAll(params: MembershipRemoveAllParams): CompletableFuture<Void?> =
        removeAll(params, RequestOptions.none())

    /** @see removeAll */
    fun removeAll(listId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        removeAll(listId, MembershipRemoveAllParams.none(), requestOptions)

    /**
     * A view of [MembershipServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MembershipServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/{listId}/memberships`, but is
         * otherwise the same as [MembershipServiceAsync.list].
         */
        fun list(listId: String): CompletableFuture<HttpResponseFor<MembershipListPageAsync>> =
            list(listId, MembershipListParams.none())

        /** @see list */
        fun list(
            listId: String,
            params: MembershipListParams = MembershipListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipListPageAsync>> =
            list(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see list */
        fun list(
            listId: String,
            params: MembershipListParams = MembershipListParams.none(),
        ): CompletableFuture<HttpResponseFor<MembershipListPageAsync>> =
            list(listId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MembershipListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipListPageAsync>>

        /** @see list */
        fun list(
            params: MembershipListParams
        ): CompletableFuture<HttpResponseFor<MembershipListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipListPageAsync>> =
            list(listId, MembershipListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/memberships/add`, but is
         * otherwise the same as [MembershipServiceAsync.add].
         */
        fun add(
            listId: String,
            params: MembershipAddParams,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            add(listId, params, RequestOptions.none())

        /** @see add */
        fun add(
            listId: String,
            params: MembershipAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            add(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see add */
        fun add(
            params: MembershipAddParams
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: MembershipAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/lists/{listId}/memberships/add-from/{sourceListId}`, but is otherwise the same as
         * [MembershipServiceAsync.addAllFromList].
         */
        fun addAllFromList(
            sourceListId: String,
            params: MembershipAddAllFromListParams,
        ): CompletableFuture<HttpResponse> =
            addAllFromList(sourceListId, params, RequestOptions.none())

        /** @see addAllFromList */
        fun addAllFromList(
            sourceListId: String,
            params: MembershipAddAllFromListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addAllFromList(params.toBuilder().sourceListId(sourceListId).build(), requestOptions)

        /** @see addAllFromList */
        fun addAllFromList(
            params: MembershipAddAllFromListParams
        ): CompletableFuture<HttpResponse> = addAllFromList(params, RequestOptions.none())

        /** @see addAllFromList */
        fun addAllFromList(
            params: MembershipAddAllFromListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/memberships/add-and-remove`,
         * but is otherwise the same as [MembershipServiceAsync.addAndRemove].
         */
        fun addAndRemove(
            listId: String,
            params: MembershipAddAndRemoveParams,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addAndRemove(listId, params, RequestOptions.none())

        /** @see addAndRemove */
        fun addAndRemove(
            listId: String,
            params: MembershipAddAndRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addAndRemove(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see addAndRemove */
        fun addAndRemove(
            params: MembershipAddAndRemoveParams
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            addAndRemove(params, RequestOptions.none())

        /** @see addAndRemove */
        fun addAndRemove(
            params: MembershipAddAndRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/lists/records/{objectTypeId}/{recordId}/memberships`, but is otherwise the same
         * as [MembershipServiceAsync.getLists].
         */
        fun getLists(
            recordId: String,
            params: MembershipGetListsParams,
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging>> =
            getLists(recordId, params, RequestOptions.none())

        /** @see getLists */
        fun getLists(
            recordId: String,
            params: MembershipGetListsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging>> =
            getLists(params.toBuilder().recordId(recordId).build(), requestOptions)

        /** @see getLists */
        fun getLists(
            params: MembershipGetListsParams
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging>> =
            getLists(params, RequestOptions.none())

        /** @see getLists */
        fun getLists(
            params: MembershipGetListsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/{listId}/memberships/join-order`, but
         * is otherwise the same as [MembershipServiceAsync.getPageOrderedByAddedToListDate].
         */
        fun getPageOrderedByAddedToListDate(
            listId: String
        ): CompletableFuture<HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePageAsync>> =
            getPageOrderedByAddedToListDate(
                listId,
                MembershipGetPageOrderedByAddedToListDateParams.none(),
            )

        /** @see getPageOrderedByAddedToListDate */
        fun getPageOrderedByAddedToListDate(
            listId: String,
            params: MembershipGetPageOrderedByAddedToListDateParams =
                MembershipGetPageOrderedByAddedToListDateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePageAsync>> =
            getPageOrderedByAddedToListDate(
                params.toBuilder().listId(listId).build(),
                requestOptions,
            )

        /** @see getPageOrderedByAddedToListDate */
        fun getPageOrderedByAddedToListDate(
            listId: String,
            params: MembershipGetPageOrderedByAddedToListDateParams =
                MembershipGetPageOrderedByAddedToListDateParams.none(),
        ): CompletableFuture<HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePageAsync>> =
            getPageOrderedByAddedToListDate(listId, params, RequestOptions.none())

        /** @see getPageOrderedByAddedToListDate */
        fun getPageOrderedByAddedToListDate(
            params: MembershipGetPageOrderedByAddedToListDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePageAsync>>

        /** @see getPageOrderedByAddedToListDate */
        fun getPageOrderedByAddedToListDate(
            params: MembershipGetPageOrderedByAddedToListDateParams
        ): CompletableFuture<HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePageAsync>> =
            getPageOrderedByAddedToListDate(params, RequestOptions.none())

        /** @see getPageOrderedByAddedToListDate */
        fun getPageOrderedByAddedToListDate(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePageAsync>> =
            getPageOrderedByAddedToListDate(
                listId,
                MembershipGetPageOrderedByAddedToListDateParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/memberships/remove`, but is
         * otherwise the same as [MembershipServiceAsync.remove].
         */
        fun remove(
            listId: String,
            params: MembershipRemoveParams,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            remove(listId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            listId: String,
            params: MembershipRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            remove(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see remove */
        fun remove(
            params: MembershipRemoveParams
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: MembershipRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /crm/v3/lists/{listId}/memberships`, but is
         * otherwise the same as [MembershipServiceAsync.removeAll].
         */
        fun removeAll(listId: String): CompletableFuture<HttpResponse> =
            removeAll(listId, MembershipRemoveAllParams.none())

        /** @see removeAll */
        fun removeAll(
            listId: String,
            params: MembershipRemoveAllParams = MembershipRemoveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            removeAll(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see removeAll */
        fun removeAll(
            listId: String,
            params: MembershipRemoveAllParams = MembershipRemoveAllParams.none(),
        ): CompletableFuture<HttpResponse> = removeAll(listId, params, RequestOptions.none())

        /** @see removeAll */
        fun removeAll(
            params: MembershipRemoveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see removeAll */
        fun removeAll(params: MembershipRemoveAllParams): CompletableFuture<HttpResponse> =
            removeAll(params, RequestOptions.none())

        /** @see removeAll */
        fun removeAll(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            removeAll(listId, MembershipRemoveAllParams.none(), requestOptions)
    }
}
