// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objects

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.PublicMergeInput
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.deals.DealCreateParams
import com.hubspot.sdk.models.crm.objects.deals.DealDeleteParams
import com.hubspot.sdk.models.crm.objects.deals.DealGetParams
import com.hubspot.sdk.models.crm.objects.deals.DealListPageAsync
import com.hubspot.sdk.models.crm.objects.deals.DealListParams
import com.hubspot.sdk.models.crm.objects.deals.DealMergeParams
import com.hubspot.sdk.models.crm.objects.deals.DealSearchParams
import com.hubspot.sdk.models.crm.objects.deals.DealUpdateParams
import com.hubspot.sdk.services.async.crm.objects.deals.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DealServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a deal with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard deals is provided.
     */
    fun create(params: DealCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DealCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            DealCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{dealId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{dealId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(dealId: String, params: DealUpdateParams): CompletableFuture<SimplePublicObject> =
        update(dealId, params, RequestOptions.none())

    /** @see update */
    fun update(
        dealId: String,
        params: DealUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().dealId(dealId).build(), requestOptions)

    /** @see update */
    fun update(params: DealUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DealUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of deals. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<DealListPageAsync> = list(DealListParams.none())

    /** @see list */
    fun list(
        params: DealListParams = DealListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DealListPageAsync>

    /** @see list */
    fun list(params: DealListParams = DealListParams.none()): CompletableFuture<DealListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DealListPageAsync> =
        list(DealListParams.none(), requestOptions)

    /** Move an Object identified by `{dealId}` to the recycling bin. */
    fun delete(dealId: String): CompletableFuture<Void?> = delete(dealId, DealDeleteParams.none())

    /** @see delete */
    fun delete(
        dealId: String,
        params: DealDeleteParams = DealDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().dealId(dealId).build(), requestOptions)

    /** @see delete */
    fun delete(
        dealId: String,
        params: DealDeleteParams = DealDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(dealId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DealDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DealDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(dealId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(dealId, DealDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{dealId}`. `{dealId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(dealId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(dealId, DealGetParams.none())

    /** @see get */
    fun get(
        dealId: String,
        params: DealGetParams = DealGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().dealId(dealId).build(), requestOptions)

    /** @see get */
    fun get(
        dealId: String,
        params: DealGetParams = DealGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(dealId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DealGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: DealGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        dealId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(dealId, DealGetParams.none(), requestOptions)

    /** Combine two deals of the same type into a single deal. */
    fun merge(params: DealMergeParams): CompletableFuture<SimplePublicObject> =
        merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: DealMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        merge(DealMergeParams.builder().publicMergeInput(publicMergeInput).build(), requestOptions)

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): CompletableFuture<SimplePublicObject> =
        merge(publicMergeInput, RequestOptions.none())

    /** Search for deals using specified criteria and filters. */
    fun search(
        params: DealSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: DealSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            DealSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [DealServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-3`, but is otherwise the
         * same as [DealServiceAsync.create].
         */
        fun create(
            params: DealCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DealCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                DealCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/0-3/{dealId}`, but is
         * otherwise the same as [DealServiceAsync.update].
         */
        fun update(
            dealId: String,
            params: DealUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(dealId, params, RequestOptions.none())

        /** @see update */
        fun update(
            dealId: String,
            params: DealUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().dealId(dealId).build(), requestOptions)

        /** @see update */
        fun update(
            params: DealUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DealUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-3`, but is otherwise the same
         * as [DealServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DealListPageAsync>> =
            list(DealListParams.none())

        /** @see list */
        fun list(
            params: DealListParams = DealListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DealListPageAsync>>

        /** @see list */
        fun list(
            params: DealListParams = DealListParams.none()
        ): CompletableFuture<HttpResponseFor<DealListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DealListPageAsync>> =
            list(DealListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/0-3/{dealId}`, but is
         * otherwise the same as [DealServiceAsync.delete].
         */
        fun delete(dealId: String): CompletableFuture<HttpResponse> =
            delete(dealId, DealDeleteParams.none())

        /** @see delete */
        fun delete(
            dealId: String,
            params: DealDeleteParams = DealDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().dealId(dealId).build(), requestOptions)

        /** @see delete */
        fun delete(
            dealId: String,
            params: DealDeleteParams = DealDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(dealId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DealDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DealDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            dealId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(dealId, DealDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-3/{dealId}`, but is otherwise
         * the same as [DealServiceAsync.get].
         */
        fun get(
            dealId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(dealId, DealGetParams.none())

        /** @see get */
        fun get(
            dealId: String,
            params: DealGetParams = DealGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().dealId(dealId).build(), requestOptions)

        /** @see get */
        fun get(
            dealId: String,
            params: DealGetParams = DealGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(dealId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DealGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: DealGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            dealId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(dealId, DealGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-3/merge`, but is otherwise
         * the same as [DealServiceAsync.merge].
         */
        fun merge(params: DealMergeParams): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params, RequestOptions.none())

        /** @see merge */
        fun merge(
            params: DealMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see merge */
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(
                DealMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        fun merge(
            publicMergeInput: PublicMergeInput
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-3/search`, but is otherwise
         * the same as [DealServiceAsync.search].
         */
        fun search(
            params: DealSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: DealSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                DealSearchParams.builder()
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
