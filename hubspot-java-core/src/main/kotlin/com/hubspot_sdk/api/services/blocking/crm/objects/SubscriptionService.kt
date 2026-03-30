// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionCreateParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionDeleteParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionGetParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionListPage
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionListParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionSearchParams
import com.hubspot_sdk.api.models.crm.objects.subscriptions.SubscriptionUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.subscriptions.BatchService
import java.util.function.Consumer

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    fun batch(): BatchService

    /** Create a new subscription object with specified properties and optional associations. */
    fun create(params: SubscriptionCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            SubscriptionCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /** Update a specific subscription by its ID with new property values. */
    fun update(subscriptionId: String, params: SubscriptionUpdateParams): SimplePublicObject =
        update(subscriptionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(params: SubscriptionUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve a list of subscription objects, with options to filter by properties, associations,
     * and archived status.
     */
    fun list(): SubscriptionListPage = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPage

    /** @see list */
    fun list(params: SubscriptionListParams = SubscriptionListParams.none()): SubscriptionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SubscriptionListPage =
        list(SubscriptionListParams.none(), requestOptions)

    /** Delete a specific subscription by its ID. */
    fun delete(subscriptionId: String) = delete(subscriptionId, SubscriptionDeleteParams.none())

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
    ) = delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(subscriptionId: String, requestOptions: RequestOptions) =
        delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

    /** Retrieve a specific subscription by its ID, including its properties and associations. */
    fun get(subscriptionId: String): SimplePublicObjectWithAssociations =
        get(subscriptionId, SubscriptionGetParams.none())

    /** @see get */
    fun get(
        subscriptionId: String,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see get */
    fun get(
        subscriptionId: String,
        params: SubscriptionGetParams = SubscriptionGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(subscriptionId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SubscriptionGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: SubscriptionGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        subscriptionId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(subscriptionId, SubscriptionGetParams.none(), requestOptions)

    /**
     * Execute a search for CRM commerce subscriptions based on defined filters, properties, and
     * sorting options. This endpoint allows for complex queries to retrieve specific subscription
     * data, supporting pagination and a variety of search parameters.
     */
    fun search(params: SubscriptionSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: SubscriptionSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            SubscriptionSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions`, but is
         * otherwise the same as [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(params: SubscriptionCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                SubscriptionCreateParams.builder()
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
         * Returns a raw HTTP response for `patch
         * /crm/objects/2026-03/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams,
        ): HttpResponseFor<SimplePublicObject> =
            update(subscriptionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SubscriptionUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/subscriptions`, but is
         * otherwise the same as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SubscriptionListPage> = list(SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): HttpResponseFor<SubscriptionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListPage> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.delete].
         */
        @MustBeClosed
        fun delete(subscriptionId: String): HttpResponse =
            delete(subscriptionId, SubscriptionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        ): HttpResponse = delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SubscriptionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(subscriptionId: String, requestOptions: RequestOptions): HttpResponse =
            delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.get].
         */
        @MustBeClosed
        fun get(subscriptionId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(subscriptionId, SubscriptionGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            subscriptionId: String,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            subscriptionId: String,
            params: SubscriptionGetParams = SubscriptionGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(subscriptionId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SubscriptionGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(
            params: SubscriptionGetParams
        ): HttpResponseFor<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(subscriptionId, SubscriptionGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/subscriptions/search`, but is
         * otherwise the same as [SubscriptionService.search].
         */
        @MustBeClosed
        fun search(
            params: SubscriptionSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: SubscriptionSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                SubscriptionSearchParams.builder()
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
