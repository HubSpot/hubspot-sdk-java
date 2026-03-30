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
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxCreateParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxDeleteParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxGetParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxListPageAsync
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxListParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxSearchParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.taxes.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TaxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a tax with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard taxes is provided.
     */
    fun create(params: TaxCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TaxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            TaxCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{taxId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{taxId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(taxId: String, params: TaxUpdateParams): CompletableFuture<SimplePublicObject> =
        update(taxId, params, RequestOptions.none())

    /** @see update */
    fun update(
        taxId: String,
        params: TaxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().taxId(taxId).build(), requestOptions)

    /** @see update */
    fun update(params: TaxUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TaxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of taxes. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<TaxListPageAsync> = list(TaxListParams.none())

    /** @see list */
    fun list(
        params: TaxListParams = TaxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaxListPageAsync>

    /** @see list */
    fun list(params: TaxListParams = TaxListParams.none()): CompletableFuture<TaxListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TaxListPageAsync> =
        list(TaxListParams.none(), requestOptions)

    /** Move an Object identified by `{taxId}` to the recycling bin. */
    fun delete(taxId: String): CompletableFuture<Void?> = delete(taxId, TaxDeleteParams.none())

    /** @see delete */
    fun delete(
        taxId: String,
        params: TaxDeleteParams = TaxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().taxId(taxId).build(), requestOptions)

    /** @see delete */
    fun delete(
        taxId: String,
        params: TaxDeleteParams = TaxDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(taxId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TaxDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TaxDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(taxId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(taxId, TaxDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{taxId}`. `{taxId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(taxId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(taxId, TaxGetParams.none())

    /** @see get */
    fun get(
        taxId: String,
        params: TaxGetParams = TaxGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().taxId(taxId).build(), requestOptions)

    /** @see get */
    fun get(
        taxId: String,
        params: TaxGetParams = TaxGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(taxId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaxGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: TaxGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        taxId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(taxId, TaxGetParams.none(), requestOptions)

    /**
     * Execute a search for tax objects based on defined filters, sorting options, and properties to
     * be included in the response. This allows for customized retrieval of tax data according to
     * specific search parameters.
     */
    fun search(
        params: TaxSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: TaxSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            TaxSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [TaxServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/taxes`, but is otherwise the
         * same as [TaxServiceAsync.create].
         */
        fun create(
            params: TaxCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TaxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                TaxCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/taxes/{taxId}`, but is
         * otherwise the same as [TaxServiceAsync.update].
         */
        fun update(
            taxId: String,
            params: TaxUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(taxId, params, RequestOptions.none())

        /** @see update */
        fun update(
            taxId: String,
            params: TaxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().taxId(taxId).build(), requestOptions)

        /** @see update */
        fun update(
            params: TaxUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TaxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/taxes`, but is otherwise the
         * same as [TaxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TaxListPageAsync>> =
            list(TaxListParams.none())

        /** @see list */
        fun list(
            params: TaxListParams = TaxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaxListPageAsync>>

        /** @see list */
        fun list(
            params: TaxListParams = TaxListParams.none()
        ): CompletableFuture<HttpResponseFor<TaxListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TaxListPageAsync>> =
            list(TaxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/taxes/{taxId}`, but is
         * otherwise the same as [TaxServiceAsync.delete].
         */
        fun delete(taxId: String): CompletableFuture<HttpResponse> =
            delete(taxId, TaxDeleteParams.none())

        /** @see delete */
        fun delete(
            taxId: String,
            params: TaxDeleteParams = TaxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().taxId(taxId).build(), requestOptions)

        /** @see delete */
        fun delete(
            taxId: String,
            params: TaxDeleteParams = TaxDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(taxId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TaxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TaxDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(taxId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(taxId, TaxDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/taxes/{taxId}`, but is
         * otherwise the same as [TaxServiceAsync.get].
         */
        fun get(
            taxId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(taxId, TaxGetParams.none())

        /** @see get */
        fun get(
            taxId: String,
            params: TaxGetParams = TaxGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().taxId(taxId).build(), requestOptions)

        /** @see get */
        fun get(
            taxId: String,
            params: TaxGetParams = TaxGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(taxId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TaxGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: TaxGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            taxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(taxId, TaxGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/taxes/search`, but is
         * otherwise the same as [TaxServiceAsync.search].
         */
        fun search(
            params: TaxSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: TaxSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                TaxSearchParams.builder()
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
