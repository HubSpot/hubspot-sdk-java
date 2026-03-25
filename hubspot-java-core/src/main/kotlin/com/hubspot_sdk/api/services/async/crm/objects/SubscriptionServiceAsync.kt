// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionCreateParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionDeleteParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionGetParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionListPageAsync
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionListParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionSearchParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.subscriptions.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    fun batch(): BatchServiceAsync

    /** Create a new subscription object with specified properties and optional associations. */
    fun create(params: SubscriptionCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            SubscriptionCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /** Update a specific subscription by its ID with new property values. */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(subscriptionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(params: SubscriptionUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /**
     * Retrieve a list of subscription objects, with options to filter by properties, associations,
     * and archived status.
     */
    fun list(): CompletableFuture<SubscriptionListPageAsync> = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListPageAsync>

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): CompletableFuture<SubscriptionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubscriptionListPageAsync> =
        list(SubscriptionListParams.none(), requestOptions)

    /** Delete a specific subscription by its ID. */
    fun delete(subscriptionId: String): CompletableFuture<Void?> =
        delete(subscriptionId, SubscriptionDeleteParams.none())

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(subscriptionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

    /** Retrieve a specific subscription by its ID, including its properties and associations. */
    fun get(subscriptionId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(subscriptionId, SubscriptionGetParams.none())

    /** @see get */
    fun get(
        subscriptionId: String,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see get */
    fun get(
        subscriptionId: String,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(subscriptionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: SubscriptionGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        subscriptionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(subscriptionId, SubscriptionGetParams.none(), requestOptions)

    /**
     * Execute a search for CRM commerce subscriptions based on defined filters, properties, and
     * sorting options. This endpoint allows for complex queries to retrieve specific subscription
     * data, supporting pagination and a variety of search parameters.
     */
    fun search(
        params: SubscriptionSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: SubscriptionSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            SubscriptionSearchParams.builder()
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
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubscriptionServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.create].
         */
        fun create(
            params: SubscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                SubscriptionCreateParams.builder()
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
         * /crm/objects/2026-03/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(subscriptionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: SubscriptionUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(SubscriptionListParams.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>>

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        fun delete(subscriptionId: String): CompletableFuture<HttpResponse> =
            delete(subscriptionId, SubscriptionDeleteParams.none())

        /** @see delete */
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SubscriptionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.get].
         */
        fun get(
            subscriptionId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(subscriptionId, SubscriptionGetParams.none())

        /** @see get */
        fun get(
            subscriptionId: String,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see get */
        fun get(
            subscriptionId: String,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(subscriptionId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: SubscriptionGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(subscriptionId, SubscriptionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions/search`, but is
         * otherwise the same as [SubscriptionServiceAsync.search].
         */
        fun search(
            params: SubscriptionSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: SubscriptionSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                SubscriptionSearchParams.builder()
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
