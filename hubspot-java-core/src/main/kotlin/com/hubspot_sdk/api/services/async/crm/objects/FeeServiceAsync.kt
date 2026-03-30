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
import com.hubspot_sdk.api.models.crm.objects.fees.FeeCreateParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeDeleteParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeGetParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeListPageAsync
import com.hubspot_sdk.api.models.crm.objects.fees.FeeListParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeSearchParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.fees.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FeeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeeServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a fee with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard fees is provided.
     */
    fun create(params: FeeCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FeeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            FeeCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{feeId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{feeId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(feeId: String, params: FeeUpdateParams): CompletableFuture<SimplePublicObject> =
        update(feeId, params, RequestOptions.none())

    /** @see update */
    fun update(
        feeId: String,
        params: FeeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().feeId(feeId).build(), requestOptions)

    /** @see update */
    fun update(params: FeeUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FeeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of fees. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<FeeListPageAsync> = list(FeeListParams.none())

    /** @see list */
    fun list(
        params: FeeListParams = FeeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeeListPageAsync>

    /** @see list */
    fun list(params: FeeListParams = FeeListParams.none()): CompletableFuture<FeeListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FeeListPageAsync> =
        list(FeeListParams.none(), requestOptions)

    /** Move an Object identified by `{feeId}` to the recycling bin. */
    fun delete(feeId: String): CompletableFuture<Void?> = delete(feeId, FeeDeleteParams.none())

    /** @see delete */
    fun delete(
        feeId: String,
        params: FeeDeleteParams = FeeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().feeId(feeId).build(), requestOptions)

    /** @see delete */
    fun delete(
        feeId: String,
        params: FeeDeleteParams = FeeDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(feeId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FeeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FeeDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(feeId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(feeId, FeeDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{feeId}`. `{feeId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(feeId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(feeId, FeeGetParams.none())

    /** @see get */
    fun get(
        feeId: String,
        params: FeeGetParams = FeeGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().feeId(feeId).build(), requestOptions)

    /** @see get */
    fun get(
        feeId: String,
        params: FeeGetParams = FeeGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(feeId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FeeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: FeeGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        feeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(feeId, FeeGetParams.none(), requestOptions)

    /**
     * Perform a search for fees based on various filters and criteria defined in the request body.
     * The search can include specific properties, sorting options, and pagination details to refine
     * the results.
     */
    fun search(
        params: FeeSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: FeeSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            FeeSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [FeeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeeServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/fees`, but is otherwise the
         * same as [FeeServiceAsync.create].
         */
        fun create(
            params: FeeCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FeeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                FeeCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/fees/{feeId}`, but is
         * otherwise the same as [FeeServiceAsync.update].
         */
        fun update(
            feeId: String,
            params: FeeUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(feeId, params, RequestOptions.none())

        /** @see update */
        fun update(
            feeId: String,
            params: FeeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().feeId(feeId).build(), requestOptions)

        /** @see update */
        fun update(
            params: FeeUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FeeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/fees`, but is otherwise the
         * same as [FeeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FeeListPageAsync>> =
            list(FeeListParams.none())

        /** @see list */
        fun list(
            params: FeeListParams = FeeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeeListPageAsync>>

        /** @see list */
        fun list(
            params: FeeListParams = FeeListParams.none()
        ): CompletableFuture<HttpResponseFor<FeeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FeeListPageAsync>> =
            list(FeeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/fees/{feeId}`, but is
         * otherwise the same as [FeeServiceAsync.delete].
         */
        fun delete(feeId: String): CompletableFuture<HttpResponse> =
            delete(feeId, FeeDeleteParams.none())

        /** @see delete */
        fun delete(
            feeId: String,
            params: FeeDeleteParams = FeeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().feeId(feeId).build(), requestOptions)

        /** @see delete */
        fun delete(
            feeId: String,
            params: FeeDeleteParams = FeeDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(feeId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FeeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FeeDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(feeId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(feeId, FeeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/fees/{feeId}`, but is otherwise
         * the same as [FeeServiceAsync.get].
         */
        fun get(
            feeId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(feeId, FeeGetParams.none())

        /** @see get */
        fun get(
            feeId: String,
            params: FeeGetParams = FeeGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().feeId(feeId).build(), requestOptions)

        /** @see get */
        fun get(
            feeId: String,
            params: FeeGetParams = FeeGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(feeId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FeeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: FeeGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            feeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(feeId, FeeGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/fees/search`, but is otherwise
         * the same as [FeeServiceAsync.search].
         */
        fun search(
            params: FeeSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: FeeSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                FeeSearchParams.builder()
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
