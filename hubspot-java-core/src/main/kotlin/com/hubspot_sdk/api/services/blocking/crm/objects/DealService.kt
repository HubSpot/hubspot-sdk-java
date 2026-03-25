// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicMergeInput
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.deals.DealCreateParams
import com.hubspot_sdk.api.models.crm.objects.deals.DealDeleteParams
import com.hubspot_sdk.api.models.crm.objects.deals.DealGetParams
import com.hubspot_sdk.api.models.crm.objects.deals.DealListPage
import com.hubspot_sdk.api.models.crm.objects.deals.DealListParams
import com.hubspot_sdk.api.models.crm.objects.deals.DealMergeParams
import com.hubspot_sdk.api.models.crm.objects.deals.DealSearchParams
import com.hubspot_sdk.api.models.crm.objects.deals.DealUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.deals.BatchService
import java.util.function.Consumer

interface DealService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealService

    fun batch(): BatchService

    /**
     * Create a deal with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard deals is provided.
     */
    fun create(params: DealCreateParams): SimplePublicObject = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DealCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            DealCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{dealId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{dealId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(dealId: String, params: DealUpdateParams): SimplePublicObject =
        update(dealId, params, RequestOptions.none())

    /** @see update */
    fun update(
        dealId: String,
        params: DealUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().dealId(dealId).build(), requestOptions)

    /** @see update */
    fun update(params: DealUpdateParams): SimplePublicObject = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DealUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of deals. Control what is returned via the `properties` query param. */
    fun list(): DealListPage = list(DealListParams.none())

    /** @see list */
    fun list(
        params: DealListParams = DealListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DealListPage

    /** @see list */
    fun list(params: DealListParams = DealListParams.none()): DealListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DealListPage =
        list(DealListParams.none(), requestOptions)

    /** Move an Object identified by `{dealId}` to the recycling bin. */
    fun delete(dealId: String) = delete(dealId, DealDeleteParams.none())

    /** @see delete */
    fun delete(
        dealId: String,
        params: DealDeleteParams = DealDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().dealId(dealId).build(), requestOptions)

    /** @see delete */
    fun delete(dealId: String, params: DealDeleteParams = DealDeleteParams.none()) =
        delete(dealId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DealDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: DealDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(dealId: String, requestOptions: RequestOptions) =
        delete(dealId, DealDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{dealId}`. `{dealId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(dealId: String): SimplePublicObjectWithAssociations = get(dealId, DealGetParams.none())

    /** @see get */
    fun get(
        dealId: String,
        params: DealGetParams = DealGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().dealId(dealId).build(), requestOptions)

    /** @see get */
    fun get(
        dealId: String,
        params: DealGetParams = DealGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(dealId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DealGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: DealGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(dealId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(dealId, DealGetParams.none(), requestOptions)

    /** Combine two deals of the same type into a single deal. */
    fun merge(params: DealMergeParams): SimplePublicObject = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: DealMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        merge(DealMergeParams.builder().publicMergeInput(publicMergeInput).build(), requestOptions)

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): SimplePublicObject =
        merge(publicMergeInput, RequestOptions.none())

    /** Search for deals using specified criteria and filters. */
    fun search(params: DealSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: DealSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            DealSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [DealService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-3`, but is otherwise the
         * same as [DealService.create].
         */
        @MustBeClosed
        fun create(params: DealCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DealCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                DealCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/0-3/{dealId}`, but is
         * otherwise the same as [DealService.update].
         */
        @MustBeClosed
        fun update(dealId: String, params: DealUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(dealId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            dealId: String,
            params: DealUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().dealId(dealId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DealUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DealUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-3`, but is otherwise the same
         * as [DealService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DealListPage> = list(DealListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DealListParams = DealListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DealListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: DealListParams = DealListParams.none()): HttpResponseFor<DealListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DealListPage> =
            list(DealListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/0-3/{dealId}`, but is
         * otherwise the same as [DealService.delete].
         */
        @MustBeClosed
        fun delete(dealId: String): HttpResponse = delete(dealId, DealDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            dealId: String,
            params: DealDeleteParams = DealDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().dealId(dealId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            dealId: String,
            params: DealDeleteParams = DealDeleteParams.none(),
        ): HttpResponse = delete(dealId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DealDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DealDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(dealId: String, requestOptions: RequestOptions): HttpResponse =
            delete(dealId, DealDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-3/{dealId}`, but is otherwise
         * the same as [DealService.get].
         */
        @MustBeClosed
        fun get(dealId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(dealId, DealGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            dealId: String,
            params: DealGetParams = DealGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().dealId(dealId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            dealId: String,
            params: DealGetParams = DealGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(dealId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DealGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: DealGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            dealId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(dealId, DealGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-3/merge`, but is otherwise
         * the same as [DealService.merge].
         */
        @MustBeClosed
        fun merge(params: DealMergeParams): HttpResponseFor<SimplePublicObject> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: DealMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see merge */
        @MustBeClosed
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            merge(
                DealMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        @MustBeClosed
        fun merge(publicMergeInput: PublicMergeInput): HttpResponseFor<SimplePublicObject> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-3/search`, but is otherwise
         * the same as [DealService.search].
         */
        @MustBeClosed
        fun search(
            params: DealSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: DealSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                DealSearchParams.builder()
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
