// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.lists.ListCreateParams
import com.hubspot_sdk.api.models.crm.lists.ListCreateRequest
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
import com.hubspot_sdk.api.models.crm.lists.ListSearchRequest
import com.hubspot_sdk.api.models.crm.lists.ListSearchResponse
import com.hubspot_sdk.api.models.crm.lists.ListUpdateFiltersParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateNameParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateResponse
import com.hubspot_sdk.api.models.crm.lists.ListsByIdResponse
import com.hubspot_sdk.api.models.crm.lists.PublicListConversionResponse
import com.hubspot_sdk.api.services.blocking.crm.lists.FolderService
import com.hubspot_sdk.api.services.blocking.crm.lists.MappingService
import com.hubspot_sdk.api.services.blocking.crm.lists.MembershipService
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

    fun folders(): FolderService

    fun mapping(): MappingService

    fun memberships(): MembershipService

    /** Create a new list with the provided object list definition. */
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

    /**
     * Fetch multiple lists in a single request by **ILS list ID**. The response will include the
     * definitions of all lists that exist for the `listIds` provided.
     */
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

    /**
     * Delete a list by **ILS list ID**. Lists deleted through this endpoint can be restored up to
     * 90-days following the delete. After 90-days, the list is purged and can no longer be
     * restored.
     */
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

    /** Delete an existing scheduled conversion for a list. */
    fun deleteScheduleConversion(listId: String) =
        deleteScheduleConversion(listId, ListDeleteScheduleConversionParams.none())

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(
        listId: String,
        params: ListDeleteScheduleConversionParams = ListDeleteScheduleConversionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(
        listId: String,
        params: ListDeleteScheduleConversionParams = ListDeleteScheduleConversionParams.none(),
    ) = deleteScheduleConversion(listId, params, RequestOptions.none())

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(
        params: ListDeleteScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(params: ListDeleteScheduleConversionParams) =
        deleteScheduleConversion(params, RequestOptions.none())

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(listId: String, requestOptions: RequestOptions) =
        deleteScheduleConversion(listId, ListDeleteScheduleConversionParams.none(), requestOptions)

    /** Fetch a single list by **ILS list ID**. */
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

    /** Fetch a single list by list name and object type. */
    fun getByObjectTypeIdAndName(
        listName: String,
        params: ListGetByObjectTypeIdAndNameParams,
    ): ListFetchResponse = getByObjectTypeIdAndName(listName, params, RequestOptions.none())

    /** @see getByObjectTypeIdAndName */
    fun getByObjectTypeIdAndName(
        listName: String,
        params: ListGetByObjectTypeIdAndNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFetchResponse =
        getByObjectTypeIdAndName(params.toBuilder().listName(listName).build(), requestOptions)

    /** @see getByObjectTypeIdAndName */
    fun getByObjectTypeIdAndName(params: ListGetByObjectTypeIdAndNameParams): ListFetchResponse =
        getByObjectTypeIdAndName(params, RequestOptions.none())

    /** @see getByObjectTypeIdAndName */
    fun getByObjectTypeIdAndName(
        params: ListGetByObjectTypeIdAndNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListFetchResponse

    /**
     * Retrieve the conversion details for a list. This can be used to check for an upcoming
     * conversion, or to get the details of when a list was already converted.
     */
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

    /**
     * Restore a previously deleted list by **ILS list ID**. Deleted lists are eligible to be
     * restored up-to 90-days after the list has been deleted.
     */
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

    /**
     * Schedule the conversion of an active list into a static list, or update the already scheduled
     * conversion. This can be scheduled for a specific date or based on activity.
     */
    fun scheduleConversion(
        listId: String,
        params: ListScheduleConversionParams,
    ): PublicListConversionResponse = scheduleConversion(listId, params, RequestOptions.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        listId: String,
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicListConversionResponse =
        scheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see scheduleConversion */
    fun scheduleConversion(params: ListScheduleConversionParams): PublicListConversionResponse =
        scheduleConversion(params, RequestOptions.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicListConversionResponse

    /** Search lists by list name or page through all lists by providing an empty `query` value. */
    fun search(params: ListSearchParams): ListSearchResponse = search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ListSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListSearchResponse

    /** @see search */
    fun search(
        listSearchRequest: ListSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListSearchResponse =
        search(
            ListSearchParams.builder().listSearchRequest(listSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(listSearchRequest: ListSearchRequest): ListSearchResponse =
        search(listSearchRequest, RequestOptions.none())

    /**
     * Update the filter branch definition of a `DYNAMIC` list. Once updated, the list memberships
     * will be re-evaluated and updated to match the new definition.
     */
    fun updateFilters(listId: String, params: ListUpdateFiltersParams): ListUpdateResponse =
        updateFilters(listId, params, RequestOptions.none())

    /** @see updateFilters */
    fun updateFilters(
        listId: String,
        params: ListUpdateFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListUpdateResponse = updateFilters(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateFilters */
    fun updateFilters(params: ListUpdateFiltersParams): ListUpdateResponse =
        updateFilters(params, RequestOptions.none())

    /** @see updateFilters */
    fun updateFilters(
        params: ListUpdateFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListUpdateResponse

    /**
     * Update the name of a list. The name must be globally unique relative to all other public
     * lists in the portal.
     */
    fun updateName(listId: String): ListUpdateResponse =
        updateName(listId, ListUpdateNameParams.none())

    /** @see updateName */
    fun updateName(
        listId: String,
        params: ListUpdateNameParams = ListUpdateNameParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListUpdateResponse = updateName(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateName */
    fun updateName(
        listId: String,
        params: ListUpdateNameParams = ListUpdateNameParams.none(),
    ): ListUpdateResponse = updateName(listId, params, RequestOptions.none())

    /** @see updateName */
    fun updateName(
        params: ListUpdateNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListUpdateResponse

    /** @see updateName */
    fun updateName(params: ListUpdateNameParams): ListUpdateResponse =
        updateName(params, RequestOptions.none())

    /** @see updateName */
    fun updateName(listId: String, requestOptions: RequestOptions): ListUpdateResponse =
        updateName(listId, ListUpdateNameParams.none(), requestOptions)

    /** A view of [ListService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService.WithRawResponse

        fun folders(): FolderService.WithRawResponse

        fun mapping(): MappingService.WithRawResponse

        fun memberships(): MembershipService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/lists/`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /crm/v3/lists/`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /crm/v3/lists/{listId}`, but is otherwise the
         * same as [ListService.delete].
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
         * Returns a raw HTTP response for `delete /crm/v3/lists/{listId}/schedule-conversion`, but
         * is otherwise the same as [ListService.deleteScheduleConversion].
         */
        @MustBeClosed
        fun deleteScheduleConversion(listId: String): HttpResponse =
            deleteScheduleConversion(listId, ListDeleteScheduleConversionParams.none())

        /** @see deleteScheduleConversion */
        @MustBeClosed
        fun deleteScheduleConversion(
            listId: String,
            params: ListDeleteScheduleConversionParams = ListDeleteScheduleConversionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see deleteScheduleConversion */
        @MustBeClosed
        fun deleteScheduleConversion(
            listId: String,
            params: ListDeleteScheduleConversionParams = ListDeleteScheduleConversionParams.none(),
        ): HttpResponse = deleteScheduleConversion(listId, params, RequestOptions.none())

        /** @see deleteScheduleConversion */
        @MustBeClosed
        fun deleteScheduleConversion(
            params: ListDeleteScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteScheduleConversion */
        @MustBeClosed
        fun deleteScheduleConversion(params: ListDeleteScheduleConversionParams): HttpResponse =
            deleteScheduleConversion(params, RequestOptions.none())

        /** @see deleteScheduleConversion */
        @MustBeClosed
        fun deleteScheduleConversion(listId: String, requestOptions: RequestOptions): HttpResponse =
            deleteScheduleConversion(
                listId,
                ListDeleteScheduleConversionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/{listId}`, but is otherwise the same
         * as [ListService.get].
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
         * /crm/v3/lists/object-type-id/{objectTypeId}/name/{listName}`, but is otherwise the same
         * as [ListService.getByObjectTypeIdAndName].
         */
        @MustBeClosed
        fun getByObjectTypeIdAndName(
            listName: String,
            params: ListGetByObjectTypeIdAndNameParams,
        ): HttpResponseFor<ListFetchResponse> =
            getByObjectTypeIdAndName(listName, params, RequestOptions.none())

        /** @see getByObjectTypeIdAndName */
        @MustBeClosed
        fun getByObjectTypeIdAndName(
            listName: String,
            params: ListGetByObjectTypeIdAndNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFetchResponse> =
            getByObjectTypeIdAndName(params.toBuilder().listName(listName).build(), requestOptions)

        /** @see getByObjectTypeIdAndName */
        @MustBeClosed
        fun getByObjectTypeIdAndName(
            params: ListGetByObjectTypeIdAndNameParams
        ): HttpResponseFor<ListFetchResponse> =
            getByObjectTypeIdAndName(params, RequestOptions.none())

        /** @see getByObjectTypeIdAndName */
        @MustBeClosed
        fun getByObjectTypeIdAndName(
            params: ListGetByObjectTypeIdAndNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListFetchResponse>

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/{listId}/schedule-conversion`, but is
         * otherwise the same as [ListService.getScheduleConversion].
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
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/restore`, but is otherwise
         * the same as [ListService.restore].
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
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/schedule-conversion`, but is
         * otherwise the same as [ListService.scheduleConversion].
         */
        @MustBeClosed
        fun scheduleConversion(
            listId: String,
            params: ListScheduleConversionParams,
        ): HttpResponseFor<PublicListConversionResponse> =
            scheduleConversion(listId, params, RequestOptions.none())

        /** @see scheduleConversion */
        @MustBeClosed
        fun scheduleConversion(
            listId: String,
            params: ListScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicListConversionResponse> =
            scheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see scheduleConversion */
        @MustBeClosed
        fun scheduleConversion(
            params: ListScheduleConversionParams
        ): HttpResponseFor<PublicListConversionResponse> =
            scheduleConversion(params, RequestOptions.none())

        /** @see scheduleConversion */
        @MustBeClosed
        fun scheduleConversion(
            params: ListScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicListConversionResponse>

        /**
         * Returns a raw HTTP response for `post /crm/v3/lists/search`, but is otherwise the same as
         * [ListService.search].
         */
        @MustBeClosed
        fun search(params: ListSearchParams): HttpResponseFor<ListSearchResponse> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ListSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListSearchResponse>

        /** @see search */
        @MustBeClosed
        fun search(
            listSearchRequest: ListSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListSearchResponse> =
            search(
                ListSearchParams.builder().listSearchRequest(listSearchRequest).build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(listSearchRequest: ListSearchRequest): HttpResponseFor<ListSearchResponse> =
            search(listSearchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/update-list-filters`, but is
         * otherwise the same as [ListService.updateFilters].
         */
        @MustBeClosed
        fun updateFilters(
            listId: String,
            params: ListUpdateFiltersParams,
        ): HttpResponseFor<ListUpdateResponse> =
            updateFilters(listId, params, RequestOptions.none())

        /** @see updateFilters */
        @MustBeClosed
        fun updateFilters(
            listId: String,
            params: ListUpdateFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListUpdateResponse> =
            updateFilters(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateFilters */
        @MustBeClosed
        fun updateFilters(params: ListUpdateFiltersParams): HttpResponseFor<ListUpdateResponse> =
            updateFilters(params, RequestOptions.none())

        /** @see updateFilters */
        @MustBeClosed
        fun updateFilters(
            params: ListUpdateFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListUpdateResponse>

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/update-list-name`, but is
         * otherwise the same as [ListService.updateName].
         */
        @MustBeClosed
        fun updateName(listId: String): HttpResponseFor<ListUpdateResponse> =
            updateName(listId, ListUpdateNameParams.none())

        /** @see updateName */
        @MustBeClosed
        fun updateName(
            listId: String,
            params: ListUpdateNameParams = ListUpdateNameParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListUpdateResponse> =
            updateName(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateName */
        @MustBeClosed
        fun updateName(
            listId: String,
            params: ListUpdateNameParams = ListUpdateNameParams.none(),
        ): HttpResponseFor<ListUpdateResponse> = updateName(listId, params, RequestOptions.none())

        /** @see updateName */
        @MustBeClosed
        fun updateName(
            params: ListUpdateNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListUpdateResponse>

        /** @see updateName */
        @MustBeClosed
        fun updateName(params: ListUpdateNameParams): HttpResponseFor<ListUpdateResponse> =
            updateName(params, RequestOptions.none())

        /** @see updateName */
        @MustBeClosed
        fun updateName(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListUpdateResponse> =
            updateName(listId, ListUpdateNameParams.none(), requestOptions)
    }
}
