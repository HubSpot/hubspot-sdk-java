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
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentCreateParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentDeleteParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentGetParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentListPageAsync
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentListParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentSearchParams
import com.hubspot_sdk.api.models.crm.objects.commercepayments.CommercePaymentUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.commercepayments.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommercePaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommercePaymentServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a commerce payment with the given properties and return a copy of the object,
     * including the ID. Documentation and examples for creating standard commerce payments is
     * provided.
     */
    fun create(
        params: CommercePaymentCreateParams
    ): CompletableFuture<CreatedResponseSimplePublicObject> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommercePaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            CommercePaymentCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{commercePaymentId}`or optionally a
     * unique property value as specified by the `idProperty` query param. `{commercePaymentId}`
     * refers to the internal object ID by default, and the `idProperty` query param refers to a
     * property whose values are unique for the object. Provided property values will be
     * overwritten. Read-only and non-existent properties will result in an error. Properties values
     * can be cleared by passing an empty string.
     */
    fun update(
        commercePaymentId: String,
        params: CommercePaymentUpdateParams,
    ): CompletableFuture<SimplePublicObject> =
        update(commercePaymentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        commercePaymentId: String,
        params: CommercePaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

    /** @see update */
    fun update(params: CommercePaymentUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommercePaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /**
     * Read a page of commerce payments. Control what is returned via the `properties` query param.
     */
    fun list(): CompletableFuture<CommercePaymentListPageAsync> =
        list(CommercePaymentListParams.none())

    /** @see list */
    fun list(
        params: CommercePaymentListParams = CommercePaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommercePaymentListPageAsync>

    /** @see list */
    fun list(
        params: CommercePaymentListParams = CommercePaymentListParams.none()
    ): CompletableFuture<CommercePaymentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CommercePaymentListPageAsync> =
        list(CommercePaymentListParams.none(), requestOptions)

    /** Move an Object identified by `{commercePaymentId}` to the recycling bin. */
    fun delete(commercePaymentId: String): CompletableFuture<Void?> =
        delete(commercePaymentId, CommercePaymentDeleteParams.none())

    /** @see delete */
    fun delete(
        commercePaymentId: String,
        params: CommercePaymentDeleteParams = CommercePaymentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        commercePaymentId: String,
        params: CommercePaymentDeleteParams = CommercePaymentDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(commercePaymentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommercePaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CommercePaymentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        commercePaymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        delete(commercePaymentId, CommercePaymentDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{commercePaymentId}`. `{commercePaymentId}` refers to the
     * internal object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
     */
    fun get(commercePaymentId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(commercePaymentId, CommercePaymentGetParams.none())

    /** @see get */
    fun get(
        commercePaymentId: String,
        params: CommercePaymentGetParams = CommercePaymentGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

    /** @see get */
    fun get(
        commercePaymentId: String,
        params: CommercePaymentGetParams = CommercePaymentGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(commercePaymentId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CommercePaymentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(
        params: CommercePaymentGetParams
    ): CompletableFuture<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        commercePaymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(commercePaymentId, CommercePaymentGetParams.none(), requestOptions)

    fun search(
        params: CommercePaymentSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CommercePaymentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            CommercePaymentSearchParams.builder()
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
     * A view of [CommercePaymentServiceAsync] that provides access to raw HTTP responses for each
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
        ): CommercePaymentServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/commerce_payments`, but is
         * otherwise the same as [CommercePaymentServiceAsync.create].
         */
        fun create(
            params: CommercePaymentCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CommercePaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                CommercePaymentCreateParams.builder()
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
         * Returns a raw HTTP response for `patch
         * /crm/v3/objects/commerce_payments/{commercePaymentId}`, but is otherwise the same as
         * [CommercePaymentServiceAsync.update].
         */
        fun update(
            commercePaymentId: String,
            params: CommercePaymentUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(commercePaymentId, params, RequestOptions.none())

        /** @see update */
        fun update(
            commercePaymentId: String,
            params: CommercePaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CommercePaymentUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CommercePaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/commerce_payments`, but is otherwise
         * the same as [CommercePaymentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CommercePaymentListPageAsync>> =
            list(CommercePaymentListParams.none())

        /** @see list */
        fun list(
            params: CommercePaymentListParams = CommercePaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommercePaymentListPageAsync>>

        /** @see list */
        fun list(
            params: CommercePaymentListParams = CommercePaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<CommercePaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommercePaymentListPageAsync>> =
            list(CommercePaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/objects/commerce_payments/{commercePaymentId}`, but is otherwise the same as
         * [CommercePaymentServiceAsync.delete].
         */
        fun delete(commercePaymentId: String): CompletableFuture<HttpResponse> =
            delete(commercePaymentId, CommercePaymentDeleteParams.none())

        /** @see delete */
        fun delete(
            commercePaymentId: String,
            params: CommercePaymentDeleteParams = CommercePaymentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            commercePaymentId: String,
            params: CommercePaymentDeleteParams = CommercePaymentDeleteParams.none(),
        ): CompletableFuture<HttpResponse> =
            delete(commercePaymentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CommercePaymentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CommercePaymentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            commercePaymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(commercePaymentId, CommercePaymentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/objects/commerce_payments/{commercePaymentId}`, but is otherwise the same as
         * [CommercePaymentServiceAsync.get].
         */
        fun get(
            commercePaymentId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(commercePaymentId, CommercePaymentGetParams.none())

        /** @see get */
        fun get(
            commercePaymentId: String,
            params: CommercePaymentGetParams = CommercePaymentGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().commercePaymentId(commercePaymentId).build(), requestOptions)

        /** @see get */
        fun get(
            commercePaymentId: String,
            params: CommercePaymentGetParams = CommercePaymentGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(commercePaymentId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CommercePaymentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: CommercePaymentGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            commercePaymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(commercePaymentId, CommercePaymentGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/commerce_payments/search`, but is
         * otherwise the same as [CommercePaymentServiceAsync.search].
         */
        fun search(
            params: CommercePaymentSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: CommercePaymentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                CommercePaymentSearchParams.builder()
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
