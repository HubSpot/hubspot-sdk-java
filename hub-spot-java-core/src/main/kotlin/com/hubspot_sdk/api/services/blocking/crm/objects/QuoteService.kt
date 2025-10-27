// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteCreateParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteDeleteParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteGetParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteListPage
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteListParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteSearchParams
import com.hubspot_sdk.api.models.crm.objects.quotes.QuoteUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.quotes.BatchService
import java.util.function.Consumer

interface QuoteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuoteService

    fun batch(): BatchService

    /**
     * Create a quote with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard quotes is provided.
     */
    fun create(params: QuoteCreateParams): CreatedResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: QuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject =
        create(
            QuoteCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CreatedResponseSimplePublicObject =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{quoteId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{quoteId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(quoteId: String, params: QuoteUpdateParams): SimplePublicObject =
        update(quoteId, params, RequestOptions.none())

    /** @see update */
    fun update(
        quoteId: String,
        params: QuoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see update */
    fun update(params: QuoteUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: QuoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of quotes. Control what is returned via the `properties` query param. */
    fun list(): QuoteListPage = list(QuoteListParams.none())

    /** @see list */
    fun list(
        params: QuoteListParams = QuoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuoteListPage

    /** @see list */
    fun list(params: QuoteListParams = QuoteListParams.none()): QuoteListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): QuoteListPage =
        list(QuoteListParams.none(), requestOptions)

    /** Move an Object identified by `{quoteId}` to the recycling bin. */
    fun delete(quoteId: String) = delete(quoteId, QuoteDeleteParams.none())

    /** @see delete */
    fun delete(
        quoteId: String,
        params: QuoteDeleteParams = QuoteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see delete */
    fun delete(quoteId: String, params: QuoteDeleteParams = QuoteDeleteParams.none()) =
        delete(quoteId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: QuoteDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: QuoteDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(quoteId: String, requestOptions: RequestOptions) =
        delete(quoteId, QuoteDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{quoteId}`. `{quoteId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(quoteId: String): SimplePublicObjectWithAssociations =
        get(quoteId, QuoteGetParams.none())

    /** @see get */
    fun get(
        quoteId: String,
        params: QuoteGetParams = QuoteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see get */
    fun get(
        quoteId: String,
        params: QuoteGetParams = QuoteGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(quoteId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: QuoteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: QuoteGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(quoteId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(quoteId, QuoteGetParams.none(), requestOptions)

    fun search(params: QuoteSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: QuoteSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            QuoteSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [QuoteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QuoteService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/quotes`, but is otherwise the same
         * as [QuoteService.create].
         */
        @MustBeClosed
        fun create(params: QuoteCreateParams): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(
                QuoteCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/quotes/{quoteId}`, but is
         * otherwise the same as [QuoteService.update].
         */
        @MustBeClosed
        fun update(
            quoteId: String,
            params: QuoteUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(quoteId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            quoteId: String,
            params: QuoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: QuoteUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: QuoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/quotes`, but is otherwise the same
         * as [QuoteService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<QuoteListPage> = list(QuoteListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: QuoteListParams = QuoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuoteListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: QuoteListParams = QuoteListParams.none()): HttpResponseFor<QuoteListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<QuoteListPage> =
            list(QuoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/quotes/{quoteId}`, but is
         * otherwise the same as [QuoteService.delete].
         */
        @MustBeClosed
        fun delete(quoteId: String): HttpResponse = delete(quoteId, QuoteDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            quoteId: String,
            params: QuoteDeleteParams = QuoteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            quoteId: String,
            params: QuoteDeleteParams = QuoteDeleteParams.none(),
        ): HttpResponse = delete(quoteId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: QuoteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: QuoteDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(quoteId: String, requestOptions: RequestOptions): HttpResponse =
            delete(quoteId, QuoteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/quotes/{quoteId}`, but is otherwise
         * the same as [QuoteService.get].
         */
        @MustBeClosed
        fun get(quoteId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(quoteId, QuoteGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            quoteId: String,
            params: QuoteGetParams = QuoteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            quoteId: String,
            params: QuoteGetParams = QuoteGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(quoteId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: QuoteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: QuoteGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            quoteId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(quoteId, QuoteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/quotes/search`, but is otherwise
         * the same as [QuoteService.search].
         */
        @MustBeClosed
        fun search(
            params: QuoteSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: QuoteSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                QuoteSearchParams.builder()
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
