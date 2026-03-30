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
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteCreateParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteDeleteParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteGetParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteListPageAsync
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteListParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteSearchParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.quotes.BasicServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QuoteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuoteServiceAsync

    fun basic(): BasicServiceAsync

    /**
     * Create a quote with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard quotes is provided.
     */
    fun create(params: QuoteCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            QuoteCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{quoteId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{quoteId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(quoteId: String, params: QuoteUpdateParams): CompletableFuture<SimplePublicObject> =
        update(quoteId, params, RequestOptions.none())

    /** @see update */
    fun update(
        quoteId: String,
        params: QuoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see update */
    fun update(params: QuoteUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QuoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of quotes. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<QuoteListPageAsync> = list(QuoteListParams.none())

    /** @see list */
    fun list(
        params: QuoteListParams = QuoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QuoteListPageAsync>

    /** @see list */
    fun list(
        params: QuoteListParams = QuoteListParams.none()
    ): CompletableFuture<QuoteListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<QuoteListPageAsync> =
        list(QuoteListParams.none(), requestOptions)

    /** Move an Object identified by `{quoteId}` to the recycling bin. */
    fun delete(quoteId: String): CompletableFuture<Void?> =
        delete(quoteId, QuoteDeleteParams.none())

    /** @see delete */
    fun delete(
        quoteId: String,
        params: QuoteDeleteParams = QuoteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see delete */
    fun delete(
        quoteId: String,
        params: QuoteDeleteParams = QuoteDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(quoteId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: QuoteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: QuoteDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(quoteId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(quoteId, QuoteDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{quoteId}`. `{quoteId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(quoteId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(quoteId, QuoteGetParams.none())

    /** @see get */
    fun get(
        quoteId: String,
        params: QuoteGetParams = QuoteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see get */
    fun get(
        quoteId: String,
        params: QuoteGetParams = QuoteGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(quoteId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: QuoteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: QuoteGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        quoteId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(quoteId, QuoteGetParams.none(), requestOptions)

    /**
     * Execute a search for quotes based on the criteria defined in the request body, such as
     * filters, properties, and sorting options. This endpoint allows for detailed querying of quote
     * records to retrieve specific data sets.
     */
    fun search(
        params: QuoteSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: QuoteSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            QuoteSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [QuoteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QuoteServiceAsync.WithRawResponse

        fun basic(): BasicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/quotes`, but is otherwise the
         * same as [QuoteServiceAsync.create].
         */
        fun create(
            params: QuoteCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                QuoteCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/quotes/{quoteId}`, but is
         * otherwise the same as [QuoteServiceAsync.update].
         */
        fun update(
            quoteId: String,
            params: QuoteUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(quoteId, params, RequestOptions.none())

        /** @see update */
        fun update(
            quoteId: String,
            params: QuoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see update */
        fun update(
            params: QuoteUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: QuoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/quotes`, but is otherwise the
         * same as [QuoteServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<QuoteListPageAsync>> =
            list(QuoteListParams.none())

        /** @see list */
        fun list(
            params: QuoteListParams = QuoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QuoteListPageAsync>>

        /** @see list */
        fun list(
            params: QuoteListParams = QuoteListParams.none()
        ): CompletableFuture<HttpResponseFor<QuoteListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<QuoteListPageAsync>> =
            list(QuoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/quotes/{quoteId}`, but is
         * otherwise the same as [QuoteServiceAsync.delete].
         */
        fun delete(quoteId: String): CompletableFuture<HttpResponse> =
            delete(quoteId, QuoteDeleteParams.none())

        /** @see delete */
        fun delete(
            quoteId: String,
            params: QuoteDeleteParams = QuoteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see delete */
        fun delete(
            quoteId: String,
            params: QuoteDeleteParams = QuoteDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(quoteId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: QuoteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: QuoteDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            quoteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(quoteId, QuoteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/quotes/{quoteId}`, but is
         * otherwise the same as [QuoteServiceAsync.get].
         */
        fun get(
            quoteId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(quoteId, QuoteGetParams.none())

        /** @see get */
        fun get(
            quoteId: String,
            params: QuoteGetParams = QuoteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see get */
        fun get(
            quoteId: String,
            params: QuoteGetParams = QuoteGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(quoteId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: QuoteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: QuoteGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            quoteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(quoteId, QuoteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/quotes/search`, but is
         * otherwise the same as [QuoteServiceAsync.search].
         */
        fun search(
            params: QuoteSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: QuoteSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                QuoteSearchParams.builder()
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
