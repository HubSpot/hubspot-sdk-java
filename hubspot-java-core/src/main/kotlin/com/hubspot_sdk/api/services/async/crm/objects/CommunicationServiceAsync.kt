// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationCreateParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationGetParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationListPageAsync
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationListParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationSearchParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.communications.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommunicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommunicationServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a communication with the given properties and return a copy of the object, including
     * the ID. Documentation and examples for creating standard communications is provided.
     */
    fun create(params: CommunicationCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommunicationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            CommunicationCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{communicationId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{communicationId}` refers to
     * the internal object ID by default, and the `idProperty` query param refers to a property
     * whose values are unique for the object. Provided property values will be overwritten.
     * Read-only and non-existent properties will result in an error. Properties values can be
     * cleared by passing an empty string.
     */
    fun update(
        communicationId: String,
        params: CommunicationUpdateParams,
    ): CompletableFuture<SimplePublicObject> =
        update(communicationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        communicationId: String,
        params: CommunicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().communicationId(communicationId).build(), requestOptions)

    /** @see update */
    fun update(params: CommunicationUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommunicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of communications. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<CommunicationListPageAsync> = list(CommunicationListParams.none())

    /** @see list */
    fun list(
        params: CommunicationListParams = CommunicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommunicationListPageAsync>

    /** @see list */
    fun list(
        params: CommunicationListParams = CommunicationListParams.none()
    ): CompletableFuture<CommunicationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CommunicationListPageAsync> =
        list(CommunicationListParams.none(), requestOptions)

    /** Move an Object identified by `{communicationId}` to the recycling bin. */
    fun delete(communicationId: String): CompletableFuture<Void?> =
        delete(communicationId, CommunicationDeleteParams.none())

    /** @see delete */
    fun delete(
        communicationId: String,
        params: CommunicationDeleteParams = CommunicationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().communicationId(communicationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        communicationId: String,
        params: CommunicationDeleteParams = CommunicationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(communicationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommunicationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CommunicationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(communicationId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(communicationId, CommunicationDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{communicationId}`. `{communicationId}` refers to the internal
     * object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
     */
    fun get(communicationId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(communicationId, CommunicationGetParams.none())

    /** @see get */
    fun get(
        communicationId: String,
        params: CommunicationGetParams = CommunicationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().communicationId(communicationId).build(), requestOptions)

    /** @see get */
    fun get(
        communicationId: String,
        params: CommunicationGetParams = CommunicationGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(communicationId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CommunicationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: CommunicationGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        communicationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(communicationId, CommunicationGetParams.none(), requestOptions)

    /**
     * Search for messages by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(
        params: CommunicationSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CommunicationSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            CommunicationSearchParams.builder()
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
     * A view of [CommunicationServiceAsync] that provides access to raw HTTP responses for each
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
        ): CommunicationServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/communications`, but is
         * otherwise the same as [CommunicationServiceAsync.create].
         */
        fun create(
            params: CommunicationCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CommunicationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                CommunicationCreateParams.builder()
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
         * Returns a raw HTTP response for `patch
         * /crm/objects/2026-03/communications/{communicationId}`, but is otherwise the same as
         * [CommunicationServiceAsync.update].
         */
        fun update(
            communicationId: String,
            params: CommunicationUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(communicationId, params, RequestOptions.none())

        /** @see update */
        fun update(
            communicationId: String,
            params: CommunicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().communicationId(communicationId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CommunicationUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CommunicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/communications`, but is
         * otherwise the same as [CommunicationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CommunicationListPageAsync>> =
            list(CommunicationListParams.none())

        /** @see list */
        fun list(
            params: CommunicationListParams = CommunicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommunicationListPageAsync>>

        /** @see list */
        fun list(
            params: CommunicationListParams = CommunicationListParams.none()
        ): CompletableFuture<HttpResponseFor<CommunicationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommunicationListPageAsync>> =
            list(CommunicationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/communications/{communicationId}`, but is otherwise the same as
         * [CommunicationServiceAsync.delete].
         */
        fun delete(communicationId: String): CompletableFuture<HttpResponse> =
            delete(communicationId, CommunicationDeleteParams.none())

        /** @see delete */
        fun delete(
            communicationId: String,
            params: CommunicationDeleteParams = CommunicationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().communicationId(communicationId).build(), requestOptions)

        /** @see delete */
        fun delete(
            communicationId: String,
            params: CommunicationDeleteParams = CommunicationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(communicationId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CommunicationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CommunicationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            communicationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(communicationId, CommunicationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/communications/{communicationId}`, but is otherwise the same as
         * [CommunicationServiceAsync.get].
         */
        fun get(
            communicationId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(communicationId, CommunicationGetParams.none())

        /** @see get */
        fun get(
            communicationId: String,
            params: CommunicationGetParams = CommunicationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().communicationId(communicationId).build(), requestOptions)

        /** @see get */
        fun get(
            communicationId: String,
            params: CommunicationGetParams = CommunicationGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(communicationId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CommunicationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: CommunicationGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            communicationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(communicationId, CommunicationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/communications/search`, but is
         * otherwise the same as [CommunicationServiceAsync.search].
         */
        fun search(
            params: CommunicationSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: CommunicationSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                CommunicationSearchParams.builder()
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
