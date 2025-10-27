// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.forms.FormCreateParams
import com.hubspot_sdk.api.models.marketing.forms.FormDefinitionBase
import com.hubspot_sdk.api.models.marketing.forms.FormDefinitionCreateRequestBase
import com.hubspot_sdk.api.models.marketing.forms.FormDeleteParams
import com.hubspot_sdk.api.models.marketing.forms.FormListPage
import com.hubspot_sdk.api.models.marketing.forms.FormListParams
import com.hubspot_sdk.api.models.marketing.forms.FormReadParams
import com.hubspot_sdk.api.models.marketing.forms.FormReplaceParams
import com.hubspot_sdk.api.models.marketing.forms.FormUpdateParams
import java.util.function.Consumer

interface FormService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormService

    /** Add a new `hubspot` form */
    fun create(params: FormCreateParams): FormDefinitionBase = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FormCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormDefinitionBase

    /** @see create */
    fun create(
        formDefinitionCreateRequestBase: FormDefinitionCreateRequestBase,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormDefinitionBase =
        create(
            FormCreateParams.builder()
                .formDefinitionCreateRequestBase(formDefinitionCreateRequestBase)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        formDefinitionCreateRequestBase: FormDefinitionCreateRequestBase
    ): FormDefinitionBase = create(formDefinitionCreateRequestBase, RequestOptions.none())

    /** Update some of the form definition components */
    fun update(formId: String, params: FormUpdateParams): FormDefinitionBase =
        update(formId, params, RequestOptions.none())

    /** @see update */
    fun update(
        formId: String,
        params: FormUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormDefinitionBase = update(params.toBuilder().formId(formId).build(), requestOptions)

    /** @see update */
    fun update(params: FormUpdateParams): FormDefinitionBase = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FormUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormDefinitionBase

    /**
     * Returns a list of forms based on the search filters. By default, it returns the first 20
     * `hubspot` forms
     */
    fun list(): FormListPage = list(FormListParams.none())

    /** @see list */
    fun list(
        params: FormListParams = FormListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormListPage

    /** @see list */
    fun list(params: FormListParams = FormListParams.none()): FormListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FormListPage =
        list(FormListParams.none(), requestOptions)

    /**
     * Archive a form definition. New submissions will not be accepted and the form definition will
     * be permanently deleted after 3 months.
     */
    fun delete(formId: String) = delete(formId, FormDeleteParams.none())

    /** @see delete */
    fun delete(
        formId: String,
        params: FormDeleteParams = FormDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().formId(formId).build(), requestOptions)

    /** @see delete */
    fun delete(formId: String, params: FormDeleteParams = FormDeleteParams.none()) =
        delete(formId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FormDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FormDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(formId: String, requestOptions: RequestOptions) =
        delete(formId, FormDeleteParams.none(), requestOptions)

    /** Returns a form based on the form ID provided. */
    fun read(formId: String): FormDefinitionBase = read(formId, FormReadParams.none())

    /** @see read */
    fun read(
        formId: String,
        params: FormReadParams = FormReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormDefinitionBase = read(params.toBuilder().formId(formId).build(), requestOptions)

    /** @see read */
    fun read(formId: String, params: FormReadParams = FormReadParams.none()): FormDefinitionBase =
        read(formId, params, RequestOptions.none())

    /** @see read */
    fun read(
        params: FormReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormDefinitionBase

    /** @see read */
    fun read(params: FormReadParams): FormDefinitionBase = read(params, RequestOptions.none())

    /** @see read */
    fun read(formId: String, requestOptions: RequestOptions): FormDefinitionBase =
        read(formId, FormReadParams.none(), requestOptions)

    /** Update all fields of a hubspot form definition. */
    fun replace(formId: String, params: FormReplaceParams): FormDefinitionBase =
        replace(formId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        formId: String,
        params: FormReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormDefinitionBase = replace(params.toBuilder().formId(formId).build(), requestOptions)

    /** @see replace */
    fun replace(params: FormReplaceParams): FormDefinitionBase =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FormReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormDefinitionBase

    /** A view of [FormService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/forms/`, but is otherwise the same as
         * [FormService.create].
         */
        @MustBeClosed
        fun create(params: FormCreateParams): HttpResponseFor<FormDefinitionBase> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FormCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormDefinitionBase>

        /** @see create */
        @MustBeClosed
        fun create(
            formDefinitionCreateRequestBase: FormDefinitionCreateRequestBase,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormDefinitionBase> =
            create(
                FormCreateParams.builder()
                    .formDefinitionCreateRequestBase(formDefinitionCreateRequestBase)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            formDefinitionCreateRequestBase: FormDefinitionCreateRequestBase
        ): HttpResponseFor<FormDefinitionBase> =
            create(formDefinitionCreateRequestBase, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /marketing/v3/forms/{formId}`, but is otherwise
         * the same as [FormService.update].
         */
        @MustBeClosed
        fun update(formId: String, params: FormUpdateParams): HttpResponseFor<FormDefinitionBase> =
            update(formId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            formId: String,
            params: FormUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormDefinitionBase> =
            update(params.toBuilder().formId(formId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FormUpdateParams): HttpResponseFor<FormDefinitionBase> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FormUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormDefinitionBase>

        /**
         * Returns a raw HTTP response for `get /marketing/v3/forms/`, but is otherwise the same as
         * [FormService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<FormListPage> = list(FormListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FormListParams = FormListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: FormListParams = FormListParams.none()): HttpResponseFor<FormListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FormListPage> =
            list(FormListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/v3/forms/{formId}`, but is otherwise
         * the same as [FormService.delete].
         */
        @MustBeClosed
        fun delete(formId: String): HttpResponse = delete(formId, FormDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            formId: String,
            params: FormDeleteParams = FormDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().formId(formId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            formId: String,
            params: FormDeleteParams = FormDeleteParams.none(),
        ): HttpResponse = delete(formId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FormDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FormDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(formId: String, requestOptions: RequestOptions): HttpResponse =
            delete(formId, FormDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/v3/forms/{formId}`, but is otherwise the
         * same as [FormService.read].
         */
        @MustBeClosed
        fun read(formId: String): HttpResponseFor<FormDefinitionBase> =
            read(formId, FormReadParams.none())

        /** @see read */
        @MustBeClosed
        fun read(
            formId: String,
            params: FormReadParams = FormReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormDefinitionBase> =
            read(params.toBuilder().formId(formId).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(
            formId: String,
            params: FormReadParams = FormReadParams.none(),
        ): HttpResponseFor<FormDefinitionBase> = read(formId, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: FormReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormDefinitionBase>

        /** @see read */
        @MustBeClosed
        fun read(params: FormReadParams): HttpResponseFor<FormDefinitionBase> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            formId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormDefinitionBase> = read(formId, FormReadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /marketing/v3/forms/{formId}`, but is otherwise the
         * same as [FormService.replace].
         */
        @MustBeClosed
        fun replace(
            formId: String,
            params: FormReplaceParams,
        ): HttpResponseFor<FormDefinitionBase> = replace(formId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            formId: String,
            params: FormReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormDefinitionBase> =
            replace(params.toBuilder().formId(formId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: FormReplaceParams): HttpResponseFor<FormDefinitionBase> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: FormReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormDefinitionBase>
    }
}
