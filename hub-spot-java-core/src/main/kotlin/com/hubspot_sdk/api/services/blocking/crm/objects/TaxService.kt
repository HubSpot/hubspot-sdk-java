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
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxCreateParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxDeleteParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxGetParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxListPage
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxListParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxSearchParams
import com.hubspot_sdk.api.models.crm.objects.taxes.TaxUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.taxes.BatchService
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
    fun create(params: TaxCreateParams): CreatedResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TaxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject =
        create(
            TaxCreateParams.builder()
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
         * Returns a raw HTTP response for `post /crm/v3/objects/taxes`, but is otherwise the same
         * as [TaxService.create].
         */
        @MustBeClosed
        fun create(params: TaxCreateParams): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TaxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
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
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/taxes/{taxId}`, but is otherwise
         * the same as [TaxService.update].
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
         * Returns a raw HTTP response for `get /crm/v3/objects/taxes`, but is otherwise the same as
         * [TaxService.list].
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
         * Returns a raw HTTP response for `delete /crm/v3/objects/taxes/{taxId}`, but is otherwise
         * the same as [TaxService.delete].
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
         * Returns a raw HTTP response for `get /crm/v3/objects/taxes/{taxId}`, but is otherwise the
         * same as [TaxService.get].
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
         * Returns a raw HTTP response for `post /crm/v3/objects/taxes/search`, but is otherwise the
         * same as [TaxService.search].
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
