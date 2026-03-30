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
import com.hubspot_sdk.api.models.crm.objects.fees.FeeCreateParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeDeleteParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeGetParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeListPage
import com.hubspot_sdk.api.models.crm.objects.fees.FeeListParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeSearchParams
import com.hubspot_sdk.api.models.crm.objects.fees.FeeUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.fees.BatchService
import java.util.function.Consumer

interface FeeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeeService

    fun batch(): BatchService

    /**
     * Create a fee with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard fees is provided.
     */
    fun create(params: FeeCreateParams): SimplePublicObject = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FeeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            FeeCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{feeId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{feeId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(feeId: String, params: FeeUpdateParams): SimplePublicObject =
        update(feeId, params, RequestOptions.none())

    /** @see update */
    fun update(
        feeId: String,
        params: FeeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().feeId(feeId).build(), requestOptions)

    /** @see update */
    fun update(params: FeeUpdateParams): SimplePublicObject = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FeeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of fees. Control what is returned via the `properties` query param. */
    fun list(): FeeListPage = list(FeeListParams.none())

    /** @see list */
    fun list(
        params: FeeListParams = FeeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeeListPage

    /** @see list */
    fun list(params: FeeListParams = FeeListParams.none()): FeeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FeeListPage =
        list(FeeListParams.none(), requestOptions)

    /** Move an Object identified by `{feeId}` to the recycling bin. */
    fun delete(feeId: String) = delete(feeId, FeeDeleteParams.none())

    /** @see delete */
    fun delete(
        feeId: String,
        params: FeeDeleteParams = FeeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().feeId(feeId).build(), requestOptions)

    /** @see delete */
    fun delete(feeId: String, params: FeeDeleteParams = FeeDeleteParams.none()) =
        delete(feeId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FeeDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FeeDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(feeId: String, requestOptions: RequestOptions) =
        delete(feeId, FeeDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{feeId}`. `{feeId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(feeId: String): SimplePublicObjectWithAssociations = get(feeId, FeeGetParams.none())

    /** @see get */
    fun get(
        feeId: String,
        params: FeeGetParams = FeeGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().feeId(feeId).build(), requestOptions)

    /** @see get */
    fun get(
        feeId: String,
        params: FeeGetParams = FeeGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(feeId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FeeGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: FeeGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(feeId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(feeId, FeeGetParams.none(), requestOptions)

    /**
     * Perform a search for fees based on various filters and criteria defined in the request body.
     * The search can include specific properties, sorting options, and pagination details to refine
     * the results.
     */
    fun search(params: FeeSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: FeeSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            FeeSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [FeeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeeService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/fees`, but is otherwise the
         * same as [FeeService.create].
         */
        @MustBeClosed
        fun create(params: FeeCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FeeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                FeeCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/fees/{feeId}`, but is
         * otherwise the same as [FeeService.update].
         */
        @MustBeClosed
        fun update(feeId: String, params: FeeUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(feeId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            feeId: String,
            params: FeeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().feeId(feeId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FeeUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FeeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/fees`, but is otherwise the
         * same as [FeeService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<FeeListPage> = list(FeeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FeeListParams = FeeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeeListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: FeeListParams = FeeListParams.none()): HttpResponseFor<FeeListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FeeListPage> =
            list(FeeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/fees/{feeId}`, but is
         * otherwise the same as [FeeService.delete].
         */
        @MustBeClosed
        fun delete(feeId: String): HttpResponse = delete(feeId, FeeDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            feeId: String,
            params: FeeDeleteParams = FeeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().feeId(feeId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(feeId: String, params: FeeDeleteParams = FeeDeleteParams.none()): HttpResponse =
            delete(feeId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FeeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FeeDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(feeId: String, requestOptions: RequestOptions): HttpResponse =
            delete(feeId, FeeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/fees/{feeId}`, but is otherwise
         * the same as [FeeService.get].
         */
        @MustBeClosed
        fun get(feeId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(feeId, FeeGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            feeId: String,
            params: FeeGetParams = FeeGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().feeId(feeId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            feeId: String,
            params: FeeGetParams = FeeGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(feeId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FeeGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: FeeGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            feeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(feeId, FeeGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/fees/search`, but is otherwise
         * the same as [FeeService.search].
         */
        @MustBeClosed
        fun search(
            params: FeeSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: FeeSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                FeeSearchParams.builder()
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
