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
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentCreateParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentDeleteParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentGetParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentListPage
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentListParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentSearchParams
import com.hubspot_sdk.api.models.crm.objects.appointments.AppointmentUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.appointments.BatchService
import java.util.function.Consumer

interface AppointmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppointmentService

    fun batch(): BatchService

    /**
     * Create a appointment with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard appointments is provided.
     */
    fun create(params: AppointmentCreateParams): CreatedResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AppointmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject =
        create(
            AppointmentCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{appointmentId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{appointmentId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(appointmentId: String, params: AppointmentUpdateParams): SimplePublicObject =
        update(appointmentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appointmentId: String,
        params: AppointmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

    /** @see update */
    fun update(params: AppointmentUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AppointmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of appointments. Control what is returned via the `properties` query param. */
    fun list(): AppointmentListPage = list(AppointmentListParams.none())

    /** @see list */
    fun list(
        params: AppointmentListParams = AppointmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppointmentListPage

    /** @see list */
    fun list(params: AppointmentListParams = AppointmentListParams.none()): AppointmentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AppointmentListPage =
        list(AppointmentListParams.none(), requestOptions)

    /** Move an Object identified by `{appointmentId}` to the recycling bin. */
    fun delete(appointmentId: String) = delete(appointmentId, AppointmentDeleteParams.none())

    /** @see delete */
    fun delete(
        appointmentId: String,
        params: AppointmentDeleteParams = AppointmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        appointmentId: String,
        params: AppointmentDeleteParams = AppointmentDeleteParams.none(),
    ) = delete(appointmentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AppointmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AppointmentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appointmentId: String, requestOptions: RequestOptions) =
        delete(appointmentId, AppointmentDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{appointmentId}`. `{appointmentId}` refers to the internal
     * object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
     */
    fun get(appointmentId: String): SimplePublicObjectWithAssociations =
        get(appointmentId, AppointmentGetParams.none())

    /** @see get */
    fun get(
        appointmentId: String,
        params: AppointmentGetParams = AppointmentGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

    /** @see get */
    fun get(
        appointmentId: String,
        params: AppointmentGetParams = AppointmentGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(appointmentId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AppointmentGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: AppointmentGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        appointmentId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(appointmentId, AppointmentGetParams.none(), requestOptions)

    fun search(params: AppointmentSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: AppointmentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            AppointmentSearchParams.builder()
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
     * A view of [AppointmentService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppointmentService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-421`, but is otherwise the same
         * as [AppointmentService.create].
         */
        @MustBeClosed
        fun create(
            params: AppointmentCreateParams
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AppointmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(
                AppointmentCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/v3/objects/0-421/{appointmentId}`, but is
         * otherwise the same as [AppointmentService.update].
         */
        @MustBeClosed
        fun update(
            appointmentId: String,
            params: AppointmentUpdateParams,
        ): HttpResponseFor<SimplePublicObject> =
            update(appointmentId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            appointmentId: String,
            params: AppointmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AppointmentUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AppointmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-421`, but is otherwise the same as
         * [AppointmentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AppointmentListPage> = list(AppointmentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AppointmentListParams = AppointmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppointmentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AppointmentListParams = AppointmentListParams.none()
        ): HttpResponseFor<AppointmentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AppointmentListPage> =
            list(AppointmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/0-421/{appointmentId}`, but is
         * otherwise the same as [AppointmentService.delete].
         */
        @MustBeClosed
        fun delete(appointmentId: String): HttpResponse =
            delete(appointmentId, AppointmentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            appointmentId: String,
            params: AppointmentDeleteParams = AppointmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            appointmentId: String,
            params: AppointmentDeleteParams = AppointmentDeleteParams.none(),
        ): HttpResponse = delete(appointmentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AppointmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AppointmentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(appointmentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(appointmentId, AppointmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/0-421/{appointmentId}`, but is
         * otherwise the same as [AppointmentService.get].
         */
        @MustBeClosed
        fun get(appointmentId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(appointmentId, AppointmentGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appointmentId: String,
            params: AppointmentGetParams = AppointmentGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().appointmentId(appointmentId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appointmentId: String,
            params: AppointmentGetParams = AppointmentGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(appointmentId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AppointmentGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: AppointmentGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appointmentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(appointmentId, AppointmentGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/0-421/search`, but is otherwise the
         * same as [AppointmentService.search].
         */
        @MustBeClosed
        fun search(
            params: AppointmentSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: AppointmentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                AppointmentSearchParams.builder()
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
