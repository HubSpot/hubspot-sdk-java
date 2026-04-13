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
import com.hubspot.sdk.models.crm.objects.services.ServiceCreateParams
import com.hubspot.sdk.models.crm.objects.services.ServiceDeleteParams
import com.hubspot.sdk.models.crm.objects.services.ServiceGetParams
import com.hubspot.sdk.models.crm.objects.services.ServiceListPage
import com.hubspot.sdk.models.crm.objects.services.ServiceListParams
import com.hubspot.sdk.models.crm.objects.services.ServiceSearchParams
import com.hubspot.sdk.models.crm.objects.services.ServiceUpdateParams
import com.hubspot.sdk.services.blocking.crm.objects.services.BatchService
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

    fun batch(): BatchService

    /**
     * Create a service with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard services is provided.
     */
    fun create(params: ServiceCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ServiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            ServiceCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{serviceId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{serviceId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(serviceId: String, params: ServiceUpdateParams): SimplePublicObject =
        update(serviceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        serviceId: String,
        params: ServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().serviceId(serviceId).build(), requestOptions)

    /** @see update */
    fun update(params: ServiceUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

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

    /** Move an Object identified by `{serviceId}` to the recycling bin. */
    fun delete(serviceId: String) = delete(serviceId, ServiceDeleteParams.none())

    /** @see delete */
    fun delete(
        serviceId: String,
        params: ServiceDeleteParams = ServiceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().serviceId(serviceId).build(), requestOptions)

    /** @see delete */
    fun delete(serviceId: String, params: ServiceDeleteParams = ServiceDeleteParams.none()) =
        delete(serviceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ServiceDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ServiceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(serviceId: String, requestOptions: RequestOptions) =
        delete(serviceId, ServiceDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{serviceId}`. `{serviceId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(serviceId: String): SimplePublicObjectWithAssociations =
        get(serviceId, ServiceGetParams.none())

    /** @see get */
    fun get(
        serviceId: String,
        params: ServiceGetParams = ServiceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().serviceId(serviceId).build(), requestOptions)

    /** @see get */
    fun get(
        serviceId: String,
        params: ServiceGetParams = ServiceGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(serviceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ServiceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: ServiceGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(serviceId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(serviceId, ServiceGetParams.none(), requestOptions)

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

    /** A view of [ServiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/0-162`, but is otherwise the
         * same as [ServiceService.create].
         */
        @MustBeClosed
        fun create(params: ServiceCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ServiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                ServiceCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/0-162/{serviceId}`, but is
         * otherwise the same as [ServiceService.update].
         */
        @MustBeClosed
        fun update(
            serviceId: String,
            params: ServiceUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(serviceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            serviceId: String,
            params: ServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().serviceId(serviceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ServiceUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

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
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/0-162/{serviceId}`, but is
         * otherwise the same as [ServiceService.delete].
         */
        @MustBeClosed
        fun delete(serviceId: String): HttpResponse = delete(serviceId, ServiceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            serviceId: String,
            params: ServiceDeleteParams = ServiceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().serviceId(serviceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            serviceId: String,
            params: ServiceDeleteParams = ServiceDeleteParams.none(),
        ): HttpResponse = delete(serviceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ServiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ServiceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(serviceId: String, requestOptions: RequestOptions): HttpResponse =
            delete(serviceId, ServiceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/0-162/{serviceId}`, but is
         * otherwise the same as [ServiceService.get].
         */
        @MustBeClosed
        fun get(serviceId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(serviceId, ServiceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            serviceId: String,
            params: ServiceGetParams = ServiceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().serviceId(serviceId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            serviceId: String,
            params: ServiceGetParams = ServiceGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(serviceId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ServiceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: ServiceGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            serviceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(serviceId, ServiceGetParams.none(), requestOptions)

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
    }
}
