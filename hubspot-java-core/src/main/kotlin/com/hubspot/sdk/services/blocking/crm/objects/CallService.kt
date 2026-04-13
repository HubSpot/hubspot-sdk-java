// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.calls.CallCreateParams
import com.hubspot.sdk.models.crm.objects.calls.CallDeleteParams
import com.hubspot.sdk.models.crm.objects.calls.CallGetParams
import com.hubspot.sdk.models.crm.objects.calls.CallListPage
import com.hubspot.sdk.models.crm.objects.calls.CallListParams
import com.hubspot.sdk.models.crm.objects.calls.CallSearchParams
import com.hubspot.sdk.models.crm.objects.calls.CallUpdateParams
import com.hubspot.sdk.services.blocking.crm.objects.calls.BatchService
import java.util.function.Consumer

interface CallService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService

    fun batch(): BatchService

    /**
     * Create a call with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard calls is provided.
     */
    fun create(params: CallCreateParams): SimplePublicObject = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CallCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            CallCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{callId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{callId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(callId: String, params: CallUpdateParams): SimplePublicObject =
        update(callId, params, RequestOptions.none())

    /** @see update */
    fun update(
        callId: String,
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see update */
    fun update(params: CallUpdateParams): SimplePublicObject = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of calls. Control what is returned via the `properties` query param. */
    fun list(): CallListPage = list(CallListParams.none())

    /** @see list */
    fun list(
        params: CallListParams = CallListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallListPage

    /** @see list */
    fun list(params: CallListParams = CallListParams.none()): CallListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CallListPage =
        list(CallListParams.none(), requestOptions)

    /** Move an Object identified by `{callId}` to the recycling bin. */
    fun delete(callId: String) = delete(callId, CallDeleteParams.none())

    /** @see delete */
    fun delete(
        callId: String,
        params: CallDeleteParams = CallDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see delete */
    fun delete(callId: String, params: CallDeleteParams = CallDeleteParams.none()) =
        delete(callId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CallDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CallDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(callId: String, requestOptions: RequestOptions) =
        delete(callId, CallDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{callId}`. `{callId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(callId: String): SimplePublicObjectWithAssociations = get(callId, CallGetParams.none())

    /** @see get */
    fun get(
        callId: String,
        params: CallGetParams = CallGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see get */
    fun get(
        callId: String,
        params: CallGetParams = CallGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(callId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CallGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: CallGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(callId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(callId, CallGetParams.none(), requestOptions)

    /**
     * Search for calls by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(params: CallSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CallSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            CallSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [CallService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/calls`, but is otherwise the
         * same as [CallService.create].
         */
        @MustBeClosed
        fun create(params: CallCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CallCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                CallCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/calls/{callId}`, but is
         * otherwise the same as [CallService.update].
         */
        @MustBeClosed
        fun update(callId: String, params: CallUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(callId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            callId: String,
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CallUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/calls`, but is otherwise the
         * same as [CallService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CallListPage> = list(CallListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallListParams = CallListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CallListParams = CallListParams.none()): HttpResponseFor<CallListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CallListPage> =
            list(CallListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/calls/{callId}`, but is
         * otherwise the same as [CallService.delete].
         */
        @MustBeClosed
        fun delete(callId: String): HttpResponse = delete(callId, CallDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            callId: String,
            params: CallDeleteParams = CallDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            callId: String,
            params: CallDeleteParams = CallDeleteParams.none(),
        ): HttpResponse = delete(callId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CallDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CallDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(callId: String, requestOptions: RequestOptions): HttpResponse =
            delete(callId, CallDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/calls/{callId}`, but is
         * otherwise the same as [CallService.get].
         */
        @MustBeClosed
        fun get(callId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(callId, CallGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            callId: String,
            params: CallGetParams = CallGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            callId: String,
            params: CallGetParams = CallGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(callId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CallGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: CallGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            callId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(callId, CallGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/calls/search`, but is
         * otherwise the same as [CallService.search].
         */
        @MustBeClosed
        fun search(
            params: CallSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: CallSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                CallSearchParams.builder()
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
