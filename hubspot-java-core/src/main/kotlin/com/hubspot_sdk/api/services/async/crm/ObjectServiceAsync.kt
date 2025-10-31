// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.ObjectServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.AppointmentServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CallServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CartServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CommercePaymentServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CommunicationServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CompanyServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ContactServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ContractServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CourseServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CustomServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.DealServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.DealSplitServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.DiscountServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.EmailServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.FeeServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.FeedbackSubmissionServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.GoalTargetServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.InvoiceServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.LeadServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.LineItemServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ListingServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.MeetingServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.NoteServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ObjectServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.OrderServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.PartnerClientServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.PartnerServiceServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.PostalMailServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ProductServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.QuoteServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.SchemaServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ServiceServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.TaskServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.TaxServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.TicketServiceAsync
import java.util.function.Consumer

interface ObjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectServiceAsync

    fun appointments(): AppointmentServiceAsync

    fun calls(): CallServiceAsync

    fun carts(): CartServiceAsync

    fun commercePayments(): CommercePaymentServiceAsync

    fun communications(): CommunicationServiceAsync

    fun companies(): CompanyServiceAsync

    fun contacts(): ContactServiceAsync

    fun contracts(): ContractServiceAsync

    fun courses(): CourseServiceAsync

    fun custom(): CustomServiceAsync

    fun dealSplits(): DealSplitServiceAsync

    fun deals(): DealServiceAsync

    fun discounts(): DiscountServiceAsync

    fun emails(): EmailServiceAsync

    fun feedbackSubmissions(): FeedbackSubmissionServiceAsync

    fun fees(): FeeServiceAsync

    fun goalTargets(): GoalTargetServiceAsync

    fun invoices(): InvoiceServiceAsync

    fun leads(): LeadServiceAsync

    fun lineItems(): LineItemServiceAsync

    fun listings(): ListingServiceAsync

    fun meetings(): MeetingServiceAsync

    fun notes(): NoteServiceAsync

    fun objects(): ObjectServiceAsync

    fun orders(): OrderServiceAsync

    fun partnerClients(): PartnerClientServiceAsync

    fun partnerServices(): PartnerServiceServiceAsync

    fun postalMail(): PostalMailServiceAsync

    fun products(): ProductServiceAsync

    fun quotes(): QuoteServiceAsync

    fun schemas(): SchemaServiceAsync

    fun services(): ServiceServiceAsync

    fun tasks(): TaskServiceAsync

    fun taxes(): TaxServiceAsync

    fun tickets(): TicketServiceAsync

    /**
     * A view of [ObjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectServiceAsync.WithRawResponse

        fun appointments(): AppointmentServiceAsync.WithRawResponse

        fun calls(): CallServiceAsync.WithRawResponse

        fun carts(): CartServiceAsync.WithRawResponse

        fun commercePayments(): CommercePaymentServiceAsync.WithRawResponse

        fun communications(): CommunicationServiceAsync.WithRawResponse

        fun companies(): CompanyServiceAsync.WithRawResponse

        fun contacts(): ContactServiceAsync.WithRawResponse

        fun contracts(): ContractServiceAsync.WithRawResponse

        fun courses(): CourseServiceAsync.WithRawResponse

        fun custom(): CustomServiceAsync.WithRawResponse

        fun dealSplits(): DealSplitServiceAsync.WithRawResponse

        fun deals(): DealServiceAsync.WithRawResponse

        fun discounts(): DiscountServiceAsync.WithRawResponse

        fun emails(): EmailServiceAsync.WithRawResponse

        fun feedbackSubmissions(): FeedbackSubmissionServiceAsync.WithRawResponse

        fun fees(): FeeServiceAsync.WithRawResponse

        fun goalTargets(): GoalTargetServiceAsync.WithRawResponse

        fun invoices(): InvoiceServiceAsync.WithRawResponse

        fun leads(): LeadServiceAsync.WithRawResponse

        fun lineItems(): LineItemServiceAsync.WithRawResponse

        fun listings(): ListingServiceAsync.WithRawResponse

        fun meetings(): MeetingServiceAsync.WithRawResponse

        fun notes(): NoteServiceAsync.WithRawResponse

        fun objects(): ObjectServiceAsync.WithRawResponse

        fun orders(): OrderServiceAsync.WithRawResponse

        fun partnerClients(): PartnerClientServiceAsync.WithRawResponse

        fun partnerServices(): PartnerServiceServiceAsync.WithRawResponse

        fun postalMail(): PostalMailServiceAsync.WithRawResponse

        fun products(): ProductServiceAsync.WithRawResponse

        fun quotes(): QuoteServiceAsync.WithRawResponse

        fun schemas(): SchemaServiceAsync.WithRawResponse

        fun services(): ServiceServiceAsync.WithRawResponse

        fun tasks(): TaskServiceAsync.WithRawResponse

        fun taxes(): TaxServiceAsync.WithRawResponse

        fun tickets(): TicketServiceAsync.WithRawResponse
    }
}
