// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.lists

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetPageOrderedByAddedToListDatePage
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetPageOrderedByAddedToListDateParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipListPage
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipListParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipRemoveAllParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipRemoveParams
import java.util.function.Consumer

interface MembershipService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MembershipService

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
    fun list(listId: String): MembershipListPage = list(listId, MembershipListParams.none())

    /** @see list */
    fun list(
        listId: String,
        params: MembershipListParams = MembershipListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipListPage = list(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see list */
    fun list(
        listId: String,
        params: MembershipListParams = MembershipListParams.none(),
    ): MembershipListPage = list(listId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MembershipListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipListPage

    /** @see list */
    fun list(params: MembershipListParams): MembershipListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(listId: String, requestOptions: RequestOptions): MembershipListPage =
        list(listId, MembershipListParams.none(), requestOptions)

    /**
     * Add the records provided to the list. Records that do not exist or that are already members
     * of the list are ignored.
     *
     * This endpoint only works for lists that have a `processingType` of `MANUAL` or `SNAPSHOT`.
     */
    fun add(listId: String, params: MembershipAddParams): MembershipsUpdateResponse =
        add(listId, params, RequestOptions.none())

    /** @see add */
    fun add(
        listId: String,
        params: MembershipAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse = add(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see add */
    fun add(params: MembershipAddParams): MembershipsUpdateResponse =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: MembershipAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse

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
    fun addAllFromList(sourceListId: String, params: MembershipAddAllFromListParams) =
        addAllFromList(sourceListId, params, RequestOptions.none())

    /** @see addAllFromList */
    fun addAllFromList(
        sourceListId: String,
        params: MembershipAddAllFromListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addAllFromList(params.toBuilder().sourceListId(sourceListId).build(), requestOptions)

    /** @see addAllFromList */
    fun addAllFromList(params: MembershipAddAllFromListParams) =
        addAllFromList(params, RequestOptions.none())

    /** @see addAllFromList */
    fun addAllFromList(
        params: MembershipAddAllFromListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Add and/or remove records that have already been created in the system to and/or from a list.
     *
     * This endpoint only works for lists that have a `processingType` of `MANUAL` or `SNAPSHOT`.
     */
    fun addAndRemove(
        listId: String,
        params: MembershipAddAndRemoveParams,
    ): MembershipsUpdateResponse = addAndRemove(listId, params, RequestOptions.none())

    /** @see addAndRemove */
    fun addAndRemove(
        listId: String,
        params: MembershipAddAndRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse =
        addAndRemove(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see addAndRemove */
    fun addAndRemove(params: MembershipAddAndRemoveParams): MembershipsUpdateResponse =
        addAndRemove(params, RequestOptions.none())

    /** @see addAndRemove */
    fun addAndRemove(
        params: MembershipAddAndRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse

    /** For given record provide lists this record is member of. */
    fun getLists(
        recordId: String,
        params: MembershipGetListsParams,
    ): ApiCollectionResponseRecordListMembershipNoPaging =
        getLists(recordId, params, RequestOptions.none())

    /** @see getLists */
    fun getLists(
        recordId: String,
        params: MembershipGetListsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiCollectionResponseRecordListMembershipNoPaging =
        getLists(params.toBuilder().recordId(recordId).build(), requestOptions)

    /** @see getLists */
    fun getLists(
        params: MembershipGetListsParams
    ): ApiCollectionResponseRecordListMembershipNoPaging = getLists(params, RequestOptions.none())

    /** @see getLists */
    fun getLists(
        params: MembershipGetListsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiCollectionResponseRecordListMembershipNoPaging

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
    ): MembershipGetPageOrderedByAddedToListDatePage =
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
    ): MembershipGetPageOrderedByAddedToListDatePage =
        getPageOrderedByAddedToListDate(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        listId: String,
        params: MembershipGetPageOrderedByAddedToListDateParams =
            MembershipGetPageOrderedByAddedToListDateParams.none(),
    ): MembershipGetPageOrderedByAddedToListDatePage =
        getPageOrderedByAddedToListDate(listId, params, RequestOptions.none())

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        params: MembershipGetPageOrderedByAddedToListDateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipGetPageOrderedByAddedToListDatePage

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        params: MembershipGetPageOrderedByAddedToListDateParams
    ): MembershipGetPageOrderedByAddedToListDatePage =
        getPageOrderedByAddedToListDate(params, RequestOptions.none())

    /** @see getPageOrderedByAddedToListDate */
    fun getPageOrderedByAddedToListDate(
        listId: String,
        requestOptions: RequestOptions,
    ): MembershipGetPageOrderedByAddedToListDatePage =
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
    fun remove(listId: String, params: MembershipRemoveParams): MembershipsUpdateResponse =
        remove(listId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        listId: String,
        params: MembershipRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse = remove(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see remove */
    fun remove(params: MembershipRemoveParams): MembershipsUpdateResponse =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: MembershipRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MembershipsUpdateResponse

    /**
     * Remove **all** of the records from a list. ***Note:*** *The list is not deleted.*
     *
     * This endpoint only works for lists that have a `processingType` of `MANUAL` or `SNAPSHOT`.
     *
     * This endpoint only supports lists that have less than 100,000 memberships.
     */
    fun removeAll(listId: String) = removeAll(listId, MembershipRemoveAllParams.none())

    /** @see removeAll */
    fun removeAll(
        listId: String,
        params: MembershipRemoveAllParams = MembershipRemoveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = removeAll(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see removeAll */
    fun removeAll(
        listId: String,
        params: MembershipRemoveAllParams = MembershipRemoveAllParams.none(),
    ) = removeAll(listId, params, RequestOptions.none())

    /** @see removeAll */
    fun removeAll(
        params: MembershipRemoveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see removeAll */
    fun removeAll(params: MembershipRemoveAllParams) = removeAll(params, RequestOptions.none())

    /** @see removeAll */
    fun removeAll(listId: String, requestOptions: RequestOptions) =
        removeAll(listId, MembershipRemoveAllParams.none(), requestOptions)

    /** A view of [MembershipService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MembershipService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/{listId}/memberships`, but is
         * otherwise the same as [MembershipService.list].
         */
        @MustBeClosed
        fun list(listId: String): HttpResponseFor<MembershipListPage> =
            list(listId, MembershipListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            listId: String,
            params: MembershipListParams = MembershipListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipListPage> =
            list(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            listId: String,
            params: MembershipListParams = MembershipListParams.none(),
        ): HttpResponseFor<MembershipListPage> = list(listId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MembershipListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: MembershipListParams): HttpResponseFor<MembershipListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MembershipListPage> =
            list(listId, MembershipListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/memberships/add`, but is
         * otherwise the same as [MembershipService.add].
         */
        @MustBeClosed
        fun add(
            listId: String,
            params: MembershipAddParams,
        ): HttpResponseFor<MembershipsUpdateResponse> = add(listId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            listId: String,
            params: MembershipAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse> =
            add(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: MembershipAddParams): HttpResponseFor<MembershipsUpdateResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: MembershipAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/lists/{listId}/memberships/add-from/{sourceListId}`, but is otherwise the same as
         * [MembershipService.addAllFromList].
         */
        @MustBeClosed
        fun addAllFromList(
            sourceListId: String,
            params: MembershipAddAllFromListParams,
        ): HttpResponse = addAllFromList(sourceListId, params, RequestOptions.none())

        /** @see addAllFromList */
        @MustBeClosed
        fun addAllFromList(
            sourceListId: String,
            params: MembershipAddAllFromListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            addAllFromList(params.toBuilder().sourceListId(sourceListId).build(), requestOptions)

        /** @see addAllFromList */
        @MustBeClosed
        fun addAllFromList(params: MembershipAddAllFromListParams): HttpResponse =
            addAllFromList(params, RequestOptions.none())

        /** @see addAllFromList */
        @MustBeClosed
        fun addAllFromList(
            params: MembershipAddAllFromListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/memberships/add-and-remove`,
         * but is otherwise the same as [MembershipService.addAndRemove].
         */
        @MustBeClosed
        fun addAndRemove(
            listId: String,
            params: MembershipAddAndRemoveParams,
        ): HttpResponseFor<MembershipsUpdateResponse> =
            addAndRemove(listId, params, RequestOptions.none())

        /** @see addAndRemove */
        @MustBeClosed
        fun addAndRemove(
            listId: String,
            params: MembershipAddAndRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse> =
            addAndRemove(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see addAndRemove */
        @MustBeClosed
        fun addAndRemove(
            params: MembershipAddAndRemoveParams
        ): HttpResponseFor<MembershipsUpdateResponse> = addAndRemove(params, RequestOptions.none())

        /** @see addAndRemove */
        @MustBeClosed
        fun addAndRemove(
            params: MembershipAddAndRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/lists/records/{objectTypeId}/{recordId}/memberships`, but is otherwise the same
         * as [MembershipService.getLists].
         */
        @MustBeClosed
        fun getLists(
            recordId: String,
            params: MembershipGetListsParams,
        ): HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging> =
            getLists(recordId, params, RequestOptions.none())

        /** @see getLists */
        @MustBeClosed
        fun getLists(
            recordId: String,
            params: MembershipGetListsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging> =
            getLists(params.toBuilder().recordId(recordId).build(), requestOptions)

        /** @see getLists */
        @MustBeClosed
        fun getLists(
            params: MembershipGetListsParams
        ): HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging> =
            getLists(params, RequestOptions.none())

        /** @see getLists */
        @MustBeClosed
        fun getLists(
            params: MembershipGetListsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging>

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/{listId}/memberships/join-order`, but
         * is otherwise the same as [MembershipService.getPageOrderedByAddedToListDate].
         */
        @MustBeClosed
        fun getPageOrderedByAddedToListDate(
            listId: String
        ): HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePage> =
            getPageOrderedByAddedToListDate(
                listId,
                MembershipGetPageOrderedByAddedToListDateParams.none(),
            )

        /** @see getPageOrderedByAddedToListDate */
        @MustBeClosed
        fun getPageOrderedByAddedToListDate(
            listId: String,
            params: MembershipGetPageOrderedByAddedToListDateParams =
                MembershipGetPageOrderedByAddedToListDateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePage> =
            getPageOrderedByAddedToListDate(
                params.toBuilder().listId(listId).build(),
                requestOptions,
            )

        /** @see getPageOrderedByAddedToListDate */
        @MustBeClosed
        fun getPageOrderedByAddedToListDate(
            listId: String,
            params: MembershipGetPageOrderedByAddedToListDateParams =
                MembershipGetPageOrderedByAddedToListDateParams.none(),
        ): HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePage> =
            getPageOrderedByAddedToListDate(listId, params, RequestOptions.none())

        /** @see getPageOrderedByAddedToListDate */
        @MustBeClosed
        fun getPageOrderedByAddedToListDate(
            params: MembershipGetPageOrderedByAddedToListDateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePage>

        /** @see getPageOrderedByAddedToListDate */
        @MustBeClosed
        fun getPageOrderedByAddedToListDate(
            params: MembershipGetPageOrderedByAddedToListDateParams
        ): HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePage> =
            getPageOrderedByAddedToListDate(params, RequestOptions.none())

        /** @see getPageOrderedByAddedToListDate */
        @MustBeClosed
        fun getPageOrderedByAddedToListDate(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePage> =
            getPageOrderedByAddedToListDate(
                listId,
                MembershipGetPageOrderedByAddedToListDateParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/memberships/remove`, but is
         * otherwise the same as [MembershipService.remove].
         */
        @MustBeClosed
        fun remove(
            listId: String,
            params: MembershipRemoveParams,
        ): HttpResponseFor<MembershipsUpdateResponse> =
            remove(listId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            listId: String,
            params: MembershipRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse> =
            remove(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: MembershipRemoveParams): HttpResponseFor<MembershipsUpdateResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: MembershipRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MembershipsUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /crm/v3/lists/{listId}/memberships`, but is
         * otherwise the same as [MembershipService.removeAll].
         */
        @MustBeClosed
        fun removeAll(listId: String): HttpResponse =
            removeAll(listId, MembershipRemoveAllParams.none())

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(
            listId: String,
            params: MembershipRemoveAllParams = MembershipRemoveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = removeAll(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(
            listId: String,
            params: MembershipRemoveAllParams = MembershipRemoveAllParams.none(),
        ): HttpResponse = removeAll(listId, params, RequestOptions.none())

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(
            params: MembershipRemoveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(params: MembershipRemoveAllParams): HttpResponse =
            removeAll(params, RequestOptions.none())

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(listId: String, requestOptions: RequestOptions): HttpResponse =
            removeAll(listId, MembershipRemoveAllParams.none(), requestOptions)
    }
}
