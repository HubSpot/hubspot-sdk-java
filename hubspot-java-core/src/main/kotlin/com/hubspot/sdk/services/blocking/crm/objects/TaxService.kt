// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.taxes.TaxCreateParams
import com.hubspot.sdk.models.crm.objects.taxes.TaxDeleteParams
import com.hubspot.sdk.models.crm.objects.taxes.TaxGetParams
import com.hubspot.sdk.models.crm.objects.taxes.TaxListPage
import com.hubspot.sdk.models.crm.objects.taxes.TaxListParams
import com.hubspot.sdk.models.crm.objects.taxes.TaxSearchParams
import com.hubspot.sdk.models.crm.objects.taxes.TaxUpdateParams
import com.hubspot.sdk.services.blocking.crm.objects.taxes.BatchService
import java.util.function.Consumer

interface TaxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxService

    fun batch(): BatchService

    /**
     * Create a tax with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard taxes is provided.
     */
    fun create(params: TaxCreateParams): SimplePublicObject = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TaxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            TaxCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{taxId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{taxId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(taxId: String, params: TaxUpdateParams): SimplePublicObject =
        update(taxId, params, RequestOptions.none())

    /** @see update */
    fun update(
        taxId: String,
        params: TaxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().taxId(taxId).build(), requestOptions)

    /** @see update */
    fun update(params: TaxUpdateParams): SimplePublicObject = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TaxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of taxes. Control what is returned via the `properties` query param. */
    fun list(): TaxListPage = list(TaxListParams.none())

    /** @see list */
    fun list(
        params: TaxListParams = TaxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaxListPage

    /** @see list */
    fun list(params: TaxListParams = TaxListParams.none()): TaxListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TaxListPage =
        list(TaxListParams.none(), requestOptions)

    /** Move an Object identified by `{taxId}` to the recycling bin. */
    fun delete(taxId: String) = delete(taxId, TaxDeleteParams.none())

    /** @see delete */
    fun delete(
        taxId: String,
        params: TaxDeleteParams = TaxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().taxId(taxId).build(), requestOptions)

    /** @see delete */
    fun delete(taxId: String, params: TaxDeleteParams = TaxDeleteParams.none()) =
        delete(taxId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TaxDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TaxDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(taxId: String, requestOptions: RequestOptions) =
        delete(taxId, TaxDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{taxId}`. `{taxId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(taxId: String): SimplePublicObjectWithAssociations = get(taxId, TaxGetParams.none())

    /** @see get */
    fun get(
        taxId: String,
        params: TaxGetParams = TaxGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().taxId(taxId).build(), requestOptions)

    /** @see get */
    fun get(
        taxId: String,
        params: TaxGetParams = TaxGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(taxId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaxGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: TaxGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(taxId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(taxId, TaxGetParams.none(), requestOptions)

    /**
     * Execute a search for tax objects based on defined filters, sorting options, and properties to
     * be included in the response. This allows for customized retrieval of tax data according to
     * specific search parameters.
     */
    fun search(params: TaxSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: TaxSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            TaxSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [TaxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/taxes`, but is otherwise the
         * same as [TaxService.create].
         */
        @MustBeClosed
        fun create(params: TaxCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TaxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                TaxCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/taxes/{taxId}`, but is
         * otherwise the same as [TaxService.update].
         */
        @MustBeClosed
        fun update(taxId: String, params: TaxUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(taxId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            taxId: String,
            params: TaxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().taxId(taxId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TaxUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TaxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/taxes`, but is otherwise the
         * same as [TaxService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TaxListPage> = list(TaxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TaxListParams = TaxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaxListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: TaxListParams = TaxListParams.none()): HttpResponseFor<TaxListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TaxListPage> =
            list(TaxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/taxes/{taxId}`, but is
         * otherwise the same as [TaxService.delete].
         */
        @MustBeClosed
        fun delete(taxId: String): HttpResponse = delete(taxId, TaxDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            taxId: String,
            params: TaxDeleteParams = TaxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().taxId(taxId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(taxId: String, params: TaxDeleteParams = TaxDeleteParams.none()): HttpResponse =
            delete(taxId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TaxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TaxDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(taxId: String, requestOptions: RequestOptions): HttpResponse =
            delete(taxId, TaxDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/taxes/{taxId}`, but is
         * otherwise the same as [TaxService.get].
         */
        @MustBeClosed
        fun get(taxId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(taxId, TaxGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            taxId: String,
            params: TaxGetParams = TaxGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().taxId(taxId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            taxId: String,
            params: TaxGetParams = TaxGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(taxId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TaxGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: TaxGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            taxId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(taxId, TaxGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/taxes/search`, but is
         * otherwise the same as [TaxService.search].
         */
        @MustBeClosed
        fun search(
            params: TaxSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: TaxSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                TaxSearchParams.builder()
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
