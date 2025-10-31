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
import com.hubspot_sdk.api.models.crm.objects.services.ServiceCreateParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceDeleteParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceGetParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceListPageAsync
import com.hubspot_sdk.api.models.crm.objects.services.ServiceListParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceSearchParams
import com.hubspot_sdk.api.models.crm.objects.services.ServiceUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.services.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ServiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a service with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard services is provided.
     */
    fun create(params: ServiceCreateParams): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ServiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            ServiceCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{serviceId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{serviceId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        serviceId: String,
        params: ServiceUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(serviceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        serviceId: String,
        params: ServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().serviceId(serviceId).build(), requestOptions)

    /** @see update */
    fun update(params: ServiceUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of services. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<ServiceListPageAsync> = list(ServiceListParams.none())

    /** @see list */
    fun list(
        params: ServiceListParams = ServiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceListPageAsync>

    /** @see list */
    fun list(
        params: ServiceListParams = ServiceListParams.none()
    ): CompletableFuture<ServiceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ServiceListPageAsync> =
        list(ServiceListParams.none(), requestOptions)

    /** Move an Object identified by `{serviceId}` to the recycling bin. */
    fun delete(serviceId: String): CompletableFuture<Void?> =
        delete(serviceId, ServiceDeleteParams.none())

    /** @see delete */
    fun delete(
        serviceId: String,
        params: ServiceDeleteParams = ServiceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().serviceId(serviceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        serviceId: String,
        params: ServiceDeleteParams = ServiceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(serviceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ServiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ServiceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(serviceId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(serviceId, ServiceDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{serviceId}`. `{serviceId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(serviceId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(serviceId, ServiceGetParams.none())

    /** @see get */
    fun get(
        serviceId: String,
        params: ServiceGetParams = ServiceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().serviceId(serviceId).build(), requestOptions)

    /** @see get */
    fun get(
        serviceId: String,
        params: ServiceGetParams = ServiceGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(serviceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ServiceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: ServiceGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        serviceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(serviceId, ServiceGetParams.none(), requestOptions)

    fun search(
        params: ServiceSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ServiceSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            ServiceSearchParams.builder()
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
     * A view of [ServiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-162`, but is otherwise the same
         * as [ServiceServiceAsync.create].
         */
        fun create(
            params: ServiceCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ServiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                ServiceCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/v3/objects/0-162/{serviceId}`, but is
         * otherwise the same as [ServiceServiceAsync.update].
         */
        fun update(
            serviceId: String,
            params: ServiceUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(serviceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            serviceId: String,
            params: ServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().serviceId(serviceId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ServiceUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-162`, but is otherwise the same as
         * [ServiceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ServiceListPageAsync>> =
            list(ServiceListParams.none())

        /** @see list */
        fun list(
            params: ServiceListParams = ServiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceListPageAsync>>

        /** @see list */
        fun list(
            params: ServiceListParams = ServiceListParams.none()
        ): CompletableFuture<HttpResponseFor<ServiceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ServiceListPageAsync>> =
            list(ServiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/0-162/{serviceId}`, but is
         * otherwise the same as [ServiceServiceAsync.delete].
         */
        fun delete(serviceId: String): CompletableFuture<HttpResponse> =
            delete(serviceId, ServiceDeleteParams.none())

        /** @see delete */
        fun delete(
            serviceId: String,
            params: ServiceDeleteParams = ServiceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().serviceId(serviceId).build(), requestOptions)

        /** @see delete */
        fun delete(
            serviceId: String,
            params: ServiceDeleteParams = ServiceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(serviceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ServiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ServiceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            serviceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(serviceId, ServiceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-162/{serviceId}`, but is otherwise
         * the same as [ServiceServiceAsync.get].
         */
        fun get(
            serviceId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(serviceId, ServiceGetParams.none())

        /** @see get */
        fun get(
            serviceId: String,
            params: ServiceGetParams = ServiceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().serviceId(serviceId).build(), requestOptions)

        /** @see get */
        fun get(
            serviceId: String,
            params: ServiceGetParams = ServiceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(serviceId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ServiceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: ServiceGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            serviceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(serviceId, ServiceGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-162/search`, but is otherwise the
         * same as [ServiceServiceAsync.search].
         */
        fun search(
            params: ServiceSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: ServiceSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                ServiceSearchParams.builder()
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
