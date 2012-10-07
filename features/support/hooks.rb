Before do
  @browser = Watir::Browser.new
end

After do
  @browser.close if !@browser.nil?
end
