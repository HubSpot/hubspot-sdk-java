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
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentCreateParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentDeleteParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentGetParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentListPageAsync
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentListParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentSearchParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.appointments.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AppointmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppointmentServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a appointment with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard appointments is provided.
     */
    fun create(
        params: AppointmentCreateParams
    ): CompletableFuture<CreatedResponseSimplePublicObject> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AppointmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreatedResponseSimplePublicObject> =
        create(
            AppointmentCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{appointmentId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{appointmentId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        appointmentId: String,
        params: AppointmentUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(appointmentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appointmentId: String,
        params: AppointmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

    /** @see update */
    fun update(params: AppointmentUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AppointmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of appointments. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<AppointmentListPageAsync> = list(AppointmentListParams.none())

    /** @see list */
    fun list(
        params: AppointmentListParams = AppointmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppointmentListPageAsync>

    /** @see list */
    fun list(
        params: AppointmentListParams = AppointmentListParams.none()
    ): CompletableFuture<AppointmentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AppointmentListPageAsync> =
        list(AppointmentListParams.none(), requestOptions)

    /** Move an Object identified by `{appointmentId}` to the recycling bin. */
    fun delete(appointmentId: String): CompletableFuture<Void?> =
        delete(appointmentId, AppointmentDeleteParams.none())

    /** @see delete */
    fun delete(
        appointmentId: String,
        params: AppointmentDeleteParams = AppointmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        appointmentId: String,
        params: AppointmentDeleteParams = AppointmentDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(appointmentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AppointmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AppointmentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appointmentId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(appointmentId, AppointmentDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{appointmentId}`. `{appointmentId}` refers to the internal
     * object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
     */
    fun get(appointmentId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(appointmentId, AppointmentGetParams.none())

    /** @see get */
    fun get(
        appointmentId: String,
        params: AppointmentGetParams = AppointmentGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

    /** @see get */
    fun get(
        appointmentId: String,
        params: AppointmentGetParams = AppointmentGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(appointmentId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AppointmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: AppointmentGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        appointmentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(appointmentId, AppointmentGetParams.none(), requestOptions)

    fun search(
        params: AppointmentSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: AppointmentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            AppointmentSearchParams.builder()
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
     * A view of [AppointmentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppointmentServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-421`, but is otherwise the same
         * as [AppointmentServiceAsync.create].
         */
        fun create(
            params: AppointmentCreateParams
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AppointmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreatedResponseSimplePublicObject>> =
            create(
                AppointmentCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/v3/objects/0-421/{appointmentId}`, but is
         * otherwise the same as [AppointmentServiceAsync.update].
         */
        fun update(
            appointmentId: String,
            params: AppointmentUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(appointmentId, params, RequestOptions.none())

        /** @see update */
        fun update(
            appointmentId: String,
            params: AppointmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

        /** @see update */
        fun update(
            params: AppointmentUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AppointmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-421`, but is otherwise the same as
         * [AppointmentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AppointmentListPageAsync>> =
            list(AppointmentListParams.none())

        /** @see list */
        fun list(
            params: AppointmentListParams = AppointmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppointmentListPageAsync>>

        /** @see list */
        fun list(
            params: AppointmentListParams = AppointmentListParams.none()
        ): CompletableFuture<HttpResponseFor<AppointmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AppointmentListPageAsync>> =
            list(AppointmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/0-421/{appointmentId}`, but is
         * otherwise the same as [AppointmentServiceAsync.delete].
         */
        fun delete(appointmentId: String): CompletableFuture<HttpResponse> =
            delete(appointmentId, AppointmentDeleteParams.none())

        /** @see delete */
        fun delete(
            appointmentId: String,
            params: AppointmentDeleteParams = AppointmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            appointmentId: String,
            params: AppointmentDeleteParams = AppointmentDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(appointmentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AppointmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AppointmentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            appointmentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(appointmentId, AppointmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-421/{appointmentId}`, but is
         * otherwise the same as [AppointmentServiceAsync.get].
         */
        fun get(
            appointmentId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(appointmentId, AppointmentGetParams.none())

        /** @see get */
        fun get(
            appointmentId: String,
            params: AppointmentGetParams = AppointmentGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

        /** @see get */
        fun get(
            appointmentId: String,
            params: AppointmentGetParams = AppointmentGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(appointmentId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AppointmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: AppointmentGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appointmentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(appointmentId, AppointmentGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-421/search`, but is otherwise the
         * same as [AppointmentServiceAsync.search].
         */
        fun search(
            params: AppointmentSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: AppointmentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                AppointmentSearchParams.builder()
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
