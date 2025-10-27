// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingCreateParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingDeleteParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingGetParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingListPageAsync
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingListParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingSearchParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.meetings.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeetingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a meeting with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard meetings is provided.
     */
    fun create(params: MeetingCreateParams): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MeetingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            MeetingCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{meetingId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{meetingId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        meetingId: String,
        params: MeetingUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(meetingId, params, RequestOptions.none())

    /** @see update */
    fun update(
        meetingId: String,
        params: MeetingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().meetingId(meetingId).build(), requestOptions)

    /** @see update */
    fun update(params: MeetingUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MeetingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of meetings. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<MeetingListPageAsync> = list(MeetingListParams.none())

    /** @see list */
    fun list(
        params: MeetingListParams = MeetingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeetingListPageAsync>

    /** @see list */
    fun list(
        params: MeetingListParams = MeetingListParams.none()
    ): CompletableFuture<MeetingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MeetingListPageAsync> =
        list(MeetingListParams.none(), requestOptions)

    /** Move an Object identified by `{meetingId}` to the recycling bin. */
    fun delete(meetingId: String): CompletableFuture<Void?> =
        delete(meetingId, MeetingDeleteParams.none())

    /** @see delete */
    fun delete(
        meetingId: String,
        params: MeetingDeleteParams = MeetingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().meetingId(meetingId).build(), requestOptions)

    /** @see delete */
    fun delete(
        meetingId: String,
        params: MeetingDeleteParams = MeetingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(meetingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MeetingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MeetingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(meetingId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(meetingId, MeetingDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{meetingId}`. `{meetingId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(meetingId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(meetingId, MeetingGetParams.none())

    /** @see get */
    fun get(
        meetingId: String,
        params: MeetingGetParams = MeetingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().meetingId(meetingId).build(), requestOptions)

    /** @see get */
    fun get(
        meetingId: String,
        params: MeetingGetParams = MeetingGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(meetingId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MeetingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: MeetingGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        meetingId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(meetingId, MeetingGetParams.none(), requestOptions)

    fun search(
        params: MeetingSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: MeetingSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            MeetingSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [MeetingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/meetings`, but is otherwise the
         * same as [MeetingServiceAsync.create].
         */
        fun create(
            params: MeetingCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MeetingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                MeetingCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/meetings/{meetingId}`, but is
         * otherwise the same as [MeetingServiceAsync.update].
         */
        fun update(
            meetingId: String,
            params: MeetingUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(meetingId, params, RequestOptions.none())

        /** @see update */
        fun update(
            meetingId: String,
            params: MeetingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().meetingId(meetingId).build(), requestOptions)

        /** @see update */
        fun update(
            params: MeetingUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MeetingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/meetings`, but is otherwise the same
         * as [MeetingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MeetingListPageAsync>> =
            list(MeetingListParams.none())

        /** @see list */
        fun list(
            params: MeetingListParams = MeetingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeetingListPageAsync>>

        /** @see list */
        fun list(
            params: MeetingListParams = MeetingListParams.none()
        ): CompletableFuture<HttpResponseFor<MeetingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MeetingListPageAsync>> =
            list(MeetingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/meetings/{meetingId}`, but is
         * otherwise the same as [MeetingServiceAsync.delete].
         */
        fun delete(meetingId: String): CompletableFuture<HttpResponse> =
            delete(meetingId, MeetingDeleteParams.none())

        /** @see delete */
        fun delete(
            meetingId: String,
            params: MeetingDeleteParams = MeetingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().meetingId(meetingId).build(), requestOptions)

        /** @see delete */
        fun delete(
            meetingId: String,
            params: MeetingDeleteParams = MeetingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(meetingId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MeetingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MeetingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            meetingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(meetingId, MeetingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/meetings/{meetingId}`, but is
         * otherwise the same as [MeetingServiceAsync.get].
         */
        fun get(
            meetingId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(meetingId, MeetingGetParams.none())

        /** @see get */
        fun get(
            meetingId: String,
            params: MeetingGetParams = MeetingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().meetingId(meetingId).build(), requestOptions)

        /** @see get */
        fun get(
            meetingId: String,
            params: MeetingGetParams = MeetingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(meetingId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: MeetingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: MeetingGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            meetingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(meetingId, MeetingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/meetings/search`, but is otherwise
         * the same as [MeetingServiceAsync.search].
         */
        fun search(
            params: MeetingSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: MeetingSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                MeetingSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
