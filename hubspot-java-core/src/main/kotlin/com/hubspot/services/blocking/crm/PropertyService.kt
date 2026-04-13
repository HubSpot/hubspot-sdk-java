// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.Property
import com.hubspot.models.crm.properties.CollectionResponsePropertyNoPaging
import com.hubspot.models.crm.properties.PropertyCreateParams
import com.hubspot.models.crm.properties.PropertyDeleteParams
import com.hubspot.models.crm.properties.PropertyGetParams
import com.hubspot.models.crm.properties.PropertyListParams
import com.hubspot.models.crm.properties.PropertyUpdateParams
import com.hubspot.services.blocking.crm.properties.BatchService
import com.hubspot.services.blocking.crm.properties.GroupService
import java.util.function.Consumer

interface PropertyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyService

    fun batch(): BatchService

    fun groups(): GroupService

    /** Create and return a copy of a new property for the specified object type. */
    fun create(objectType: String, params: PropertyCreateParams): Property =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: PropertyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: PropertyCreateParams): Property = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PropertyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /**
     * Perform a partial update of a property identified by { propertyName }. Provided fields will
     * be overwritten.
     */
    fun update(propertyName: String, params: PropertyUpdateParams): Property =
        update(propertyName, params, RequestOptions.none())

    /** @see update */
    fun update(
        propertyName: String,
        params: PropertyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = update(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see update */
    fun update(params: PropertyUpdateParams): Property = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PropertyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** Read all existing properties for the specified object type and HubSpot account. */
    fun list(objectType: String): CollectionResponsePropertyNoPaging =
        list(objectType, PropertyListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: PropertyListParams = PropertyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyNoPaging =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: PropertyListParams = PropertyListParams.none(),
    ): CollectionResponsePropertyNoPaging = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PropertyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePropertyNoPaging

    /** @see list */
    fun list(params: PropertyListParams): CollectionResponsePropertyNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CollectionResponsePropertyNoPaging =
        list(objectType, PropertyListParams.none(), requestOptions)

    /** Move a property identified by {propertyName} to the recycling bin. */
    fun delete(propertyName: String, params: PropertyDeleteParams) =
        delete(propertyName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        propertyName: String,
        params: PropertyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see delete */
    fun delete(params: PropertyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PropertyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Read a property identified by {propertyName}. */
    fun get(propertyName: String, params: PropertyGetParams): Property =
        get(propertyName, params, RequestOptions.none())

    /** @see get */
    fun get(
        propertyName: String,
        params: PropertyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property = get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

    /** @see get */
    fun get(params: PropertyGetParams): Property = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PropertyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Property

    /** A view of [PropertyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun groups(): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/properties/2026-03/{objectType}`, but is
         * otherwise the same as [PropertyService.create].
         */
        @MustBeClosed
        fun create(objectType: String, params: PropertyCreateParams): HttpResponseFor<Property> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: PropertyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: PropertyCreateParams): HttpResponseFor<Property> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PropertyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/properties/2026-03/{objectType}/{propertyName}`, but is otherwise the same as
         * [PropertyService.update].
         */
        @MustBeClosed
        fun update(propertyName: String, params: PropertyUpdateParams): HttpResponseFor<Property> =
            update(propertyName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            propertyName: String,
            params: PropertyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            update(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PropertyUpdateParams): HttpResponseFor<Property> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PropertyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>

        /**
         * Returns a raw HTTP response for `get /crm/properties/2026-03/{objectType}`, but is
         * otherwise the same as [PropertyService.list].
         */
        @MustBeClosed
        fun list(objectType: String): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            list(objectType, PropertyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: PropertyListParams = PropertyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: PropertyListParams = PropertyListParams.none(),
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PropertyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePropertyNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(params: PropertyListParams): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> =
            list(objectType, PropertyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/properties/2026-03/{objectType}/{propertyName}`, but is otherwise the same as
         * [PropertyService.delete].
         */
        @MustBeClosed
        fun delete(propertyName: String, params: PropertyDeleteParams): HttpResponse =
            delete(propertyName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            propertyName: String,
            params: PropertyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: PropertyDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PropertyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/properties/2026-03/{objectType}/{propertyName}`, but is otherwise the same as
         * [PropertyService.get].
         */
        @MustBeClosed
        fun get(propertyName: String, params: PropertyGetParams): HttpResponseFor<Property> =
            get(propertyName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            propertyName: String,
            params: PropertyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property> =
            get(params.toBuilder().propertyName(propertyName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: PropertyGetParams): HttpResponseFor<Property> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PropertyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Property>
    }
}
