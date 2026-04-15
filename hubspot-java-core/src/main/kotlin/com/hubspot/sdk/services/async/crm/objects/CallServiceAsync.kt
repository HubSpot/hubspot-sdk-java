// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects

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
import com.hubspot.sdk.models.crm.objects.calls.CallListPageAsync
import com.hubspot.sdk.models.crm.objects.calls.CallListParams
import com.hubspot.sdk.models.crm.objects.calls.CallSearchParams
import com.hubspot.sdk.models.crm.objects.calls.CallUpdateParams
import com.hubspot.sdk.services.async.crm.objects.calls.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CallServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a call with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard calls is provided.
     */
    fun create(params: CallCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CallCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            CallCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{callId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{callId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(callId: String, params: CallUpdateParams): CompletableFuture<SimplePublicObject> =
        update(callId, params, RequestOptions.none())

    /** @see update */
    fun update(
        callId: String,
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see update */
    fun update(params: CallUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of calls. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<CallListPageAsync> = list(CallListParams.none())

    /** @see list */
    fun list(
        params: CallListParams = CallListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallListPageAsync>

    /** @see list */
    fun list(params: CallListParams = CallListParams.none()): CompletableFuture<CallListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CallListPageAsync> =
        list(CallListParams.none(), requestOptions)

    /** Move an Object identified by `{callId}` to the recycling bin. */
    fun delete(callId: String): CompletableFuture<Void?> = delete(callId, CallDeleteParams.none())

    /** @see delete */
    fun delete(
        callId: String,
        params: CallDeleteParams = CallDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see delete */
    fun delete(
        callId: String,
        params: CallDeleteParams = CallDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(callId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CallDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CallDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(callId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(callId, CallDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{callId}`. `{callId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(callId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(callId, CallGetParams.none())

    /** @see get */
    fun get(
        callId: String,
        params: CallGetParams = CallGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see get */
    fun get(
        callId: String,
        params: CallGetParams = CallGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(callId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CallGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: CallGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        callId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(callId, CallGetParams.none(), requestOptions)

    /**
     * Search for calls by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(
        params: CallSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CallSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            CallSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [CallServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/calls`, but is otherwise the
         * same as [CallServiceAsync.create].
         */
        fun create(
            params: CallCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CallCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                CallCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/calls/{callId}`, but is
         * otherwise the same as [CallServiceAsync.update].
         */
        fun update(
            callId: String,
            params: CallUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(callId, params, RequestOptions.none())

        /** @see update */
        fun update(
            callId: String,
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CallUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/calls`, but is otherwise the
         * same as [CallServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CallListPageAsync>> =
            list(CallListParams.none())

        /** @see list */
        fun list(
            params: CallListParams = CallListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallListPageAsync>>

        /** @see list */
        fun list(
            params: CallListParams = CallListParams.none()
        ): CompletableFuture<HttpResponseFor<CallListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CallListPageAsync>> =
            list(CallListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/calls/{callId}`, but is
         * otherwise the same as [CallServiceAsync.delete].
         */
        fun delete(callId: String): CompletableFuture<HttpResponse> =
            delete(callId, CallDeleteParams.none())

        /** @see delete */
        fun delete(
            callId: String,
            params: CallDeleteParams = CallDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see delete */
        fun delete(
            callId: String,
            params: CallDeleteParams = CallDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(callId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CallDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CallDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            callId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(callId, CallDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/calls/{callId}`, but is
         * otherwise the same as [CallServiceAsync.get].
         */
        fun get(
            callId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(callId, CallGetParams.none())

        /** @see get */
        fun get(
            callId: String,
            params: CallGetParams = CallGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see get */
        fun get(
            callId: String,
            params: CallGetParams = CallGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(callId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CallGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: CallGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            callId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(callId, CallGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/calls/search`, but is
         * otherwise the same as [CallServiceAsync.search].
         */
        fun search(
            params: CallSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: CallSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                CallSearchParams.builder()
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
