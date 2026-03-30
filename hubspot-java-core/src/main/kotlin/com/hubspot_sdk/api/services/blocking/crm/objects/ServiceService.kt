// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInputForCreate
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.BatchReadInputSimplePublicObjectId
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.services.ServiceCreateParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceDeleteParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceGetParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceListPage
import com.hubspot_sdk.api.models.crm.objects.services.ServiceListParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceSearchParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceUpdateParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceUpsertParams
import java.util.function.Consumer

interface ServiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceService

    /** Create a batch of objects */
    fun create(params: ServiceCreateParams): BatchResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ServiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** @see create */
    fun create(
        batchInputSimplePublicObjectBatchInputForCreate:
            BatchInputSimplePublicObjectBatchInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        create(
            ServiceCreateParams.builder()
                .batchInputSimplePublicObjectBatchInputForCreate(
                    batchInputSimplePublicObjectBatchInputForCreate
                )
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        batchInputSimplePublicObjectBatchInputForCreate:
            BatchInputSimplePublicObjectBatchInputForCreate
    ): BatchResponseSimplePublicObject =
        create(batchInputSimplePublicObjectBatchInputForCreate, RequestOptions.none())

    /** Update a batch of objects */
    fun update(params: ServiceUpdateParams): BatchResponseSimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        update(
            ServiceUpdateParams.builder()
                .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
    ): BatchResponseSimplePublicObject =
        update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

    /** Read a page of services. Control what is returned via the `properties` query param. */
    fun list(): ServiceListPage = list(ServiceListParams.none())

    /** @see list */
    fun list(
        params: ServiceListParams = ServiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceListPage

    /** @see list */
    fun list(params: ServiceListParams = ServiceListParams.none()): ServiceListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ServiceListPage =
        list(ServiceListParams.none(), requestOptions)

    /** Archive a batch of objects */
    fun delete(params: ServiceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ServiceDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(
        batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        delete(
            ServiceDeleteParams.builder()
                .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId) =
        delete(batchInputSimplePublicObjectId, RequestOptions.none())

    /**
     * Retrieve records by record ID or include the `idProperty` parameter to retrieve records by a
     * custom unique value property.
     */
    fun get(params: ServiceGetParams): BatchResponseSimplePublicObject =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ServiceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicObject =
        get(
            ServiceGetParams.builder()
                .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
    ): BatchResponseSimplePublicObject =
        get(batchReadInputSimplePublicObjectId, RequestOptions.none())

    /** Fetch objects via a search query */
    fun search(params: ServiceSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ServiceSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            ServiceSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * Create or update records identified by a unique property value as specified by the
     * `idProperty` query param. `idProperty` query param refers to a property whose values are
     * unique for the object.
     */
    fun upsert(params: ServiceUpsertParams): BatchResponseSimplePublicUpsertObject =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: ServiceUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicUpsertObject

    /** @see upsert */
    fun upsert(
        batchInputSimplePublicObjectBatchInputUpsert: BatchInputSimplePublicObjectBatchInputUpsert,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSimplePublicUpsertObject =
        upsert(
            ServiceUpsertParams.builder()
                .batchInputSimplePublicObjectBatchInputUpsert(
                    batchInputSimplePublicObjectBatchInputUpsert
                )
                .build(),
            requestOptions,
        )

    /** @see upsert */
    fun upsert(
        batchInputSimplePublicObjectBatchInputUpsert: BatchInputSimplePublicObjectBatchInputUpsert
    ): BatchResponseSimplePublicUpsertObject =
        upsert(batchInputSimplePublicObjectBatchInputUpsert, RequestOptions.none())

    /** A view of [ServiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-162/batch/create`, but is
         * otherwise the same as [ServiceService.create].
         */
        @MustBeClosed
        fun create(params: ServiceCreateParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ServiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputSimplePublicObjectBatchInputForCreate:
                BatchInputSimplePublicObjectBatchInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(
                ServiceCreateParams.builder()
                    .batchInputSimplePublicObjectBatchInputForCreate(
                        batchInputSimplePublicObjectBatchInputForCreate
                    )
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            batchInputSimplePublicObjectBatchInputForCreate:
                BatchInputSimplePublicObjectBatchInputForCreate
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            create(batchInputSimplePublicObjectBatchInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-162/batch/update`, but is
         * otherwise the same as [ServiceService.update].
         */
        @MustBeClosed
        fun update(params: ServiceUpdateParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(
                ServiceUpdateParams.builder()
                    .batchInputSimplePublicObjectBatchInput(batchInputSimplePublicObjectBatchInput)
                    .build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            batchInputSimplePublicObjectBatchInput: BatchInputSimplePublicObjectBatchInput
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            update(batchInputSimplePublicObjectBatchInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-162`, but is otherwise the
         * same as [ServiceService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ServiceListPage> = list(ServiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ServiceListParams = ServiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ServiceListParams = ServiceListParams.none()
        ): HttpResponseFor<ServiceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ServiceListPage> =
            list(ServiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-162/batch/archive`, but is
         * otherwise the same as [ServiceService.delete].
         */
        @MustBeClosed
        fun delete(params: ServiceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ServiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(
            batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                ServiceDeleteParams.builder()
                    .batchInputSimplePublicObjectId(batchInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(batchInputSimplePublicObjectId: BatchInputSimplePublicObjectId): HttpResponse =
            delete(batchInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-162/batch/read`, but is
         * otherwise the same as [ServiceService.get].
         */
        @MustBeClosed
        fun get(params: ServiceGetParams): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ServiceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject>

        /** @see get */
        @MustBeClosed
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(
                ServiceGetParams.builder()
                    .batchReadInputSimplePublicObjectId(batchReadInputSimplePublicObjectId)
                    .build(),
                requestOptions,
            )

        /** @see get */
        @MustBeClosed
        fun get(
            batchReadInputSimplePublicObjectId: BatchReadInputSimplePublicObjectId
        ): HttpResponseFor<BatchResponseSimplePublicObject> =
            get(batchReadInputSimplePublicObjectId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-162/search`, but is
         * otherwise the same as [ServiceService.search].
         */
        @MustBeClosed
        fun search(
            params: ServiceSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ServiceSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                ServiceSearchParams.builder()
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

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-162/batch/upsert`, but is
         * otherwise the same as [ServiceService.upsert].
         */
        @MustBeClosed
        fun upsert(
            params: ServiceUpsertParams
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            params: ServiceUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject>

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            batchInputSimplePublicObjectBatchInputUpsert:
                BatchInputSimplePublicObjectBatchInputUpsert,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(
                ServiceUpsertParams.builder()
                    .batchInputSimplePublicObjectBatchInputUpsert(
                        batchInputSimplePublicObjectBatchInputUpsert
                    )
                    .build(),
                requestOptions,
            )

        /** @see upsert */
        @MustBeClosed
        fun upsert(
            batchInputSimplePublicObjectBatchInputUpsert:
                BatchInputSimplePublicObjectBatchInputUpsert
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> =
            upsert(batchInputSimplePublicObjectBatchInputUpsert, RequestOptions.none())
    }
}
