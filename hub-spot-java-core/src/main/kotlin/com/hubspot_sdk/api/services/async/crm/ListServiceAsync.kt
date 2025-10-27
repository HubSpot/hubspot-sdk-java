// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

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
import com.hubspot_sdk.api.services.async.crm.lists.FolderServiceAsync
import com.hubspot_sdk.api.services.async.crm.lists.MappingServiceAsync
import com.hubspot_sdk.api.services.async.crm.lists.MembershipServiceAsync
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

    fun folders(): FolderServiceAsync

    fun mapping(): MappingServiceAsync

    fun memberships(): MembershipServiceAsync

    /** Create a new list with the provided object list definition. */
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

    /**
     * Fetch multiple lists in a single request by **ILS list ID**. The response will include the
     * definitions of all lists that exist for the `listIds` provided.
     */
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

    /**
     * Delete a list by **ILS list ID**. Lists deleted through this endpoint can be restored up to
     * 90-days following the delete. After 90-days, the list is purged and can no longer be
     * restored.
     */
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

    /** Delete an existing scheduled conversion for a list. */
    fun deleteScheduleConversion(listId: String): CompletableFuture<Void?> =
        deleteScheduleConversion(listId, ListDeleteScheduleConversionParams.none())

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(
        listId: String,
        params: ListDeleteScheduleConversionParams = ListDeleteScheduleConversionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(
        listId: String,
        params: ListDeleteScheduleConversionParams = ListDeleteScheduleConversionParams.none(),
    ): CompletableFuture<Void?> = deleteScheduleConversion(listId, params, RequestOptions.none())

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(
        params: ListDeleteScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(
        params: ListDeleteScheduleConversionParams
    ): CompletableFuture<Void?> = deleteScheduleConversion(params, RequestOptions.none())

    /** @see deleteScheduleConversion */
    fun deleteScheduleConversion(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteScheduleConversion(listId, ListDeleteScheduleConversionParams.none(), requestOptions)

    /** Fetch a single list by **ILS list ID**. */
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

    /** Fetch a single list by list name and object type. */
    fun getByObjectTypeIdAndName(
        listName: String,
        params: ListGetByObjectTypeIdAndNameParams,
    ): CompletableFuture<ListFetchResponse> =
        getByObjectTypeIdAndName(listName, params, RequestOptions.none())

    /** @see getByObjectTypeIdAndName */
    fun getByObjectTypeIdAndName(
        listName: String,
        params: ListGetByObjectTypeIdAndNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFetchResponse> =
        getByObjectTypeIdAndName(params.toBuilder().listName(listName).build(), requestOptions)

    /** @see getByObjectTypeIdAndName */
    fun getByObjectTypeIdAndName(
        params: ListGetByObjectTypeIdAndNameParams
    ): CompletableFuture<ListFetchResponse> =
        getByObjectTypeIdAndName(params, RequestOptions.none())

    /** @see getByObjectTypeIdAndName */
    fun getByObjectTypeIdAndName(
        params: ListGetByObjectTypeIdAndNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListFetchResponse>

    /**
     * Retrieve the conversion details for a list. This can be used to check for an upcoming
     * conversion, or to get the details of when a list was already converted.
     */
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

    /**
     * Restore a previously deleted list by **ILS list ID**. Deleted lists are eligible to be
     * restored up-to 90-days after the list has been deleted.
     */
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

    /**
     * Schedule the conversion of an active list into a static list, or update the already scheduled
     * conversion. This can be scheduled for a specific date or based on activity.
     */
    fun scheduleConversion(
        listId: String,
        params: ListScheduleConversionParams,
    ): CompletableFuture<PublicListConversionResponse> =
        scheduleConversion(listId, params, RequestOptions.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        listId: String,
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicListConversionResponse> =
        scheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see scheduleConversion */
    fun scheduleConversion(
        params: ListScheduleConversionParams
    ): CompletableFuture<PublicListConversionResponse> =
        scheduleConversion(params, RequestOptions.none())

    /** @see scheduleConversion */
    fun scheduleConversion(
        params: ListScheduleConversionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicListConversionResponse>

    /** Search lists by list name or page through all lists by providing an empty `query` value. */
    fun search(params: ListSearchParams): CompletableFuture<ListSearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ListSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListSearchResponse>

    /** @see search */
    fun search(
        listSearchRequest: ListSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListSearchResponse> =
        search(
            ListSearchParams.builder().listSearchRequest(listSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(listSearchRequest: ListSearchRequest): CompletableFuture<ListSearchResponse> =
        search(listSearchRequest, RequestOptions.none())

    /**
     * Update the filter branch definition of a `DYNAMIC` list. Once updated, the list memberships
     * will be re-evaluated and updated to match the new definition.
     */
    fun updateFilters(
        listId: String,
        params: ListUpdateFiltersParams,
    ): CompletableFuture<ListUpdateResponse> = updateFilters(listId, params, RequestOptions.none())

    /** @see updateFilters */
    fun updateFilters(
        listId: String,
        params: ListUpdateFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListUpdateResponse> =
        updateFilters(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateFilters */
    fun updateFilters(params: ListUpdateFiltersParams): CompletableFuture<ListUpdateResponse> =
        updateFilters(params, RequestOptions.none())

    /** @see updateFilters */
    fun updateFilters(
        params: ListUpdateFiltersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListUpdateResponse>

    /**
     * Update the name of a list. The name must be globally unique relative to all other public
     * lists in the portal.
     */
    fun updateName(listId: String): CompletableFuture<ListUpdateResponse> =
        updateName(listId, ListUpdateNameParams.none())

    /** @see updateName */
    fun updateName(
        listId: String,
        params: ListUpdateNameParams = ListUpdateNameParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListUpdateResponse> =
        updateName(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see updateName */
    fun updateName(
        listId: String,
        params: ListUpdateNameParams = ListUpdateNameParams.none(),
    ): CompletableFuture<ListUpdateResponse> = updateName(listId, params, RequestOptions.none())

    /** @see updateName */
    fun updateName(
        params: ListUpdateNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListUpdateResponse>

    /** @see updateName */
    fun updateName(params: ListUpdateNameParams): CompletableFuture<ListUpdateResponse> =
        updateName(params, RequestOptions.none())

    /** @see updateName */
    fun updateName(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListUpdateResponse> =
        updateName(listId, ListUpdateNameParams.none(), requestOptions)

    /** A view of [ListServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync.WithRawResponse

        fun folders(): FolderServiceAsync.WithRawResponse

        fun mapping(): MappingServiceAsync.WithRawResponse

        fun memberships(): MembershipServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/lists/`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /crm/v3/lists/`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /crm/v3/lists/{listId}`, but is otherwise the
         * same as [ListServiceAsync.delete].
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
         * Returns a raw HTTP response for `delete /crm/v3/lists/{listId}/schedule-conversion`, but
         * is otherwise the same as [ListServiceAsync.deleteScheduleConversion].
         */
        fun deleteScheduleConversion(listId: String): CompletableFuture<HttpResponse> =
            deleteScheduleConversion(listId, ListDeleteScheduleConversionParams.none())

        /** @see deleteScheduleConversion */
        fun deleteScheduleConversion(
            listId: String,
            params: ListDeleteScheduleConversionParams = ListDeleteScheduleConversionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteScheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see deleteScheduleConversion */
        fun deleteScheduleConversion(
            listId: String,
            params: ListDeleteScheduleConversionParams = ListDeleteScheduleConversionParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteScheduleConversion(listId, params, RequestOptions.none())

        /** @see deleteScheduleConversion */
        fun deleteScheduleConversion(
            params: ListDeleteScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteScheduleConversion */
        fun deleteScheduleConversion(
            params: ListDeleteScheduleConversionParams
        ): CompletableFuture<HttpResponse> = deleteScheduleConversion(params, RequestOptions.none())

        /** @see deleteScheduleConversion */
        fun deleteScheduleConversion(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteScheduleConversion(
                listId,
                ListDeleteScheduleConversionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/{listId}`, but is otherwise the same
         * as [ListServiceAsync.get].
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
         * /crm/v3/lists/object-type-id/{objectTypeId}/name/{listName}`, but is otherwise the same
         * as [ListServiceAsync.getByObjectTypeIdAndName].
         */
        fun getByObjectTypeIdAndName(
            listName: String,
            params: ListGetByObjectTypeIdAndNameParams,
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            getByObjectTypeIdAndName(listName, params, RequestOptions.none())

        /** @see getByObjectTypeIdAndName */
        fun getByObjectTypeIdAndName(
            listName: String,
            params: ListGetByObjectTypeIdAndNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            getByObjectTypeIdAndName(params.toBuilder().listName(listName).build(), requestOptions)

        /** @see getByObjectTypeIdAndName */
        fun getByObjectTypeIdAndName(
            params: ListGetByObjectTypeIdAndNameParams
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>> =
            getByObjectTypeIdAndName(params, RequestOptions.none())

        /** @see getByObjectTypeIdAndName */
        fun getByObjectTypeIdAndName(
            params: ListGetByObjectTypeIdAndNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListFetchResponse>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/lists/{listId}/schedule-conversion`, but is
         * otherwise the same as [ListServiceAsync.getScheduleConversion].
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
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/restore`, but is otherwise
         * the same as [ListServiceAsync.restore].
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
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/schedule-conversion`, but is
         * otherwise the same as [ListServiceAsync.scheduleConversion].
         */
        fun scheduleConversion(
            listId: String,
            params: ListScheduleConversionParams,
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            scheduleConversion(listId, params, RequestOptions.none())

        /** @see scheduleConversion */
        fun scheduleConversion(
            listId: String,
            params: ListScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            scheduleConversion(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see scheduleConversion */
        fun scheduleConversion(
            params: ListScheduleConversionParams
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>> =
            scheduleConversion(params, RequestOptions.none())

        /** @see scheduleConversion */
        fun scheduleConversion(
            params: ListScheduleConversionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicListConversionResponse>>

        /**
         * Returns a raw HTTP response for `post /crm/v3/lists/search`, but is otherwise the same as
         * [ListServiceAsync.search].
         */
        fun search(
            params: ListSearchParams
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: ListSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>>

        /** @see search */
        fun search(
            listSearchRequest: ListSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>> =
            search(
                ListSearchParams.builder().listSearchRequest(listSearchRequest).build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            listSearchRequest: ListSearchRequest
        ): CompletableFuture<HttpResponseFor<ListSearchResponse>> =
            search(listSearchRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/update-list-filters`, but is
         * otherwise the same as [ListServiceAsync.updateFilters].
         */
        fun updateFilters(
            listId: String,
            params: ListUpdateFiltersParams,
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateFilters(listId, params, RequestOptions.none())

        /** @see updateFilters */
        fun updateFilters(
            listId: String,
            params: ListUpdateFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateFilters(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateFilters */
        fun updateFilters(
            params: ListUpdateFiltersParams
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateFilters(params, RequestOptions.none())

        /** @see updateFilters */
        fun updateFilters(
            params: ListUpdateFiltersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>>

        /**
         * Returns a raw HTTP response for `put /crm/v3/lists/{listId}/update-list-name`, but is
         * otherwise the same as [ListServiceAsync.updateName].
         */
        fun updateName(listId: String): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateName(listId, ListUpdateNameParams.none())

        /** @see updateName */
        fun updateName(
            listId: String,
            params: ListUpdateNameParams = ListUpdateNameParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateName(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see updateName */
        fun updateName(
            listId: String,
            params: ListUpdateNameParams = ListUpdateNameParams.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateName(listId, params, RequestOptions.none())

        /** @see updateName */
        fun updateName(
            params: ListUpdateNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>>

        /** @see updateName */
        fun updateName(
            params: ListUpdateNameParams
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateName(params, RequestOptions.none())

        /** @see updateName */
        fun updateName(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListUpdateResponse>> =
            updateName(listId, ListUpdateNameParams.none(), requestOptions)
    }
}
