// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingCreateParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingDeleteParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingGetParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingListPage
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingListParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingSearchParams
import com.hubspot_sdk.api.models.crm.objects.meetings.MeetingUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.meetings.BatchService
import java.util.function.Consumer

interface MeetingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingService

    fun batch(): BatchService

    /**
     * Create a meeting with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard meetings is provided.
     */
    fun create(params: MeetingCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MeetingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            MeetingCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Update a meeting by ID (`objectId`) or unique property value (`idProperty`). Provided
     * property values will be overwritten. Read-only and non-existent properties will result in an
     * error. Properties values can be cleared by passing an empty string.
     */
    fun update(meetingId: String, params: MeetingUpdateParams): SimplePublicObject =
        update(meetingId, params, RequestOptions.none())

    /** @see update */
    fun update(
        meetingId: String,
        params: MeetingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().meetingId(meetingId).build(), requestOptions)

    /** @see update */
    fun update(params: MeetingUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MeetingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve all meetings, using query parameters to specify the information that gets returned.
     */
    fun list(): MeetingListPage = list(MeetingListParams.none())

    /** @see list */
    fun list(
        params: MeetingListParams = MeetingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingListPage

    /** @see list */
    fun list(params: MeetingListParams = MeetingListParams.none()): MeetingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MeetingListPage =
        list(MeetingListParams.none(), requestOptions)

    /** Delete a meeting by ID. */
    fun delete(meetingId: String) = delete(meetingId, MeetingDeleteParams.none())

    /** @see delete */
    fun delete(
        meetingId: String,
        params: MeetingDeleteParams = MeetingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().meetingId(meetingId).build(), requestOptions)

    /** @see delete */
    fun delete(meetingId: String, params: MeetingDeleteParams = MeetingDeleteParams.none()) =
        delete(meetingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: MeetingDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: MeetingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(meetingId: String, requestOptions: RequestOptions) =
        delete(meetingId, MeetingDeleteParams.none(), requestOptions)

    /**
     * Retrieve a meeting by its ID (`objectId`) or by a unique property (`idProperty`). You can
     * specify what is returned using the `properties` query parameter.
     */
    fun get(meetingId: String): SimplePublicObjectWithAssociations =
        get(meetingId, MeetingGetParams.none())

    /** @see get */
    fun get(
        meetingId: String,
        params: MeetingGetParams = MeetingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().meetingId(meetingId).build(), requestOptions)

    /** @see get */
    fun get(
        meetingId: String,
        params: MeetingGetParams = MeetingGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(meetingId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: MeetingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: MeetingGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(meetingId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(meetingId, MeetingGetParams.none(), requestOptions)

    /**
     * Search for meetings by filtering on properties, searching through associations, and sorting
     * results.
     */
    fun search(params: MeetingSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: MeetingSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            MeetingSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [MeetingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/meetings`, but is otherwise
         * the same as [MeetingService.create].
         */
        @MustBeClosed
        fun create(params: MeetingCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MeetingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                MeetingCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/meetings/{meetingId}`, but is
         * otherwise the same as [MeetingService.update].
         */
        @MustBeClosed
        fun update(
            meetingId: String,
            params: MeetingUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(meetingId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            meetingId: String,
            params: MeetingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().meetingId(meetingId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: MeetingUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MeetingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/meetings`, but is otherwise the
         * same as [MeetingService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MeetingListPage> = list(MeetingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MeetingListParams = MeetingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MeetingListParams = MeetingListParams.none()
        ): HttpResponseFor<MeetingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MeetingListPage> =
            list(MeetingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/meetings/{meetingId}`, but
         * is otherwise the same as [MeetingService.delete].
         */
        @MustBeClosed
        fun delete(meetingId: String): HttpResponse = delete(meetingId, MeetingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            meetingId: String,
            params: MeetingDeleteParams = MeetingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().meetingId(meetingId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            meetingId: String,
            params: MeetingDeleteParams = MeetingDeleteParams.none(),
        ): HttpResponse = delete(meetingId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MeetingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MeetingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(meetingId: String, requestOptions: RequestOptions): HttpResponse =
            delete(meetingId, MeetingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/meetings/{meetingId}`, but is
         * otherwise the same as [MeetingService.get].
         */
        @MustBeClosed
        fun get(meetingId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(meetingId, MeetingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            meetingId: String,
            params: MeetingGetParams = MeetingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().meetingId(meetingId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            meetingId: String,
            params: MeetingGetParams = MeetingGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(meetingId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: MeetingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: MeetingGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            meetingId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(meetingId, MeetingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/meetings/search`, but is
         * otherwise the same as [MeetingService.search].
         */
        @MustBeClosed
        fun search(
            params: MeetingSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: MeetingSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                MeetingSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
